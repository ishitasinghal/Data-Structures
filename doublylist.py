#the code has been practiced from "https://www.geeksforgeeks.org/doubly-linked-list/" .

class Node:
    def __init__(self, next=None, prev=None, data=None):
        self.next = next
        self.prev = prev
        self.data = data
class Double:
    def __init__(self):
        self.head = None
    def addatfront(self, info):
        newnode = Node(data = info)
        newnode.next = self.head
        newnode.prev = None
        if(self.head is not None):
            self.head.prev = newnode
        self.head = newnode
    def printinfo(self, node):
        while(node is not None):
            print(node.data, end = ' ')
            last = node
            node = node.next
    def afternode(self, prevnode, info):
        if prevnode is None:
            print("NO SUCH NODE EXISTS")
            return
        newnode = Node(data = info)
        newnode.next = prevnode.next
        prevnode.next = newnode
        newnode.prev = prevnode
        if newnode.next is not None:
            newnode.next.prev = newnode
        
        
listobj = Double()
listobj.addatfront(1)
listobj.addatfront(2)
listobj.addatfront(3)
listobj.addatfront(4)
listobj.printinfo(listobj.head)
