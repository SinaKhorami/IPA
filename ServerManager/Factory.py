import os, sys

sys.path.append(os.path.abspath("../SearchManager/"))
sys.path.append(os.path.abspath("../locationFinder/"))

from Search import Search
from Location import Location_finder

class Factory():
	def __init__(self):
		self.result = {}

	def getResult(self, component, message, device_id):
		if   component == "search":
			obj = Search(message)
			self.result["results"] = obj.searching()
		elif component == "location":
			pass
		else:
			pass
		
		
		return self.result
