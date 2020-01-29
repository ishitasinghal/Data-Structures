class Node:
    def __init__(self, data):
        self.next = None
        self.prev = None
        self.data = data
class Double:
    def __init__(self):
        self.head = None
    def addatfront(self, info):
        newnode = Node(info)
        newnode.next = self.head
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
        newnode = Node(info)
        newnode.next = prevnode.next
        prevnode.next = newnode
        newnode.prev = prevnode
        if newnode.next is not None:
            newnode.next.prev = newnode
        
        
listobj = Double()
listobj.addatfront(1)
listobj.addatfront(2)
listobj.addatfront(3)
listobj.addatfront(5)
#listobj.afternode(listobj.head.next,8)
#output: 5 3 8 2 1
listobj.afternode(listobj.head.next.next,8)
#output: 5 3 2 8 1
listobj.printinfo(listobj.head)
