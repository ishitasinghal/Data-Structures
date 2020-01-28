#the code has been practiced from "https://www.geeksforgeeks.org/doubly-linked-list/" .

class Node:
    def __init__(self, next=None, prev=None, data=None):
        self.next = next
        slef.prev = prev
        self.data = data
class Double:
    def addatfront(self, info):
        newnode = Node(data = info)
        newnode.next = self.head
        newnode.prev = None
        if(self.head is not None):
            self.head.prev = newnode
        self.head = newnode
    def printinfo(self, node):
        while(node is not None):
            print(node.data)
            last = node
            node = node.next
        
listobj = Double()
listobj.push(1)
listobj.push(2)
listobj.push(3)
listobj.push(4)
listobj.printinfo(listobj.head)

        
