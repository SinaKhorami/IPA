import os, sys

sys.path.append(os.path.abspath("../SearchManager/"))
sys.path.append(os.path.abspath("../LocationFinder/"))
sys.path.append(os.path.abspath("../Interests/"))

from Search import Search
from Location import Location_finder
from interestManager import InterestManager

class Factory():
	def __init__(self):
		self.result = {}

	def getResult(self, component, message, device_id):
		if   component == "search":
			obj1 = InterestManager(message, device_id)
			obj2 = Search(obj1)
			print(obj1, obj2)
			self.result["results"] = obj.searching()
		elif component == "location":
			obj = Location_finder(message)
			self.result = obj.find()
		else:
			pass
		
		
		return self.result
