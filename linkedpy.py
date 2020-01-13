class Node:
    def __init__(self, data=None, next_node=None):
        self.data=data
        self.next_node = next_node
        
    def getdata(self):
        return self.data
    
    def getnext(self):
        return self.next_node
        
    def setnext(self, new_node):
        self.nextnode = new_node
