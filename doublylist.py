#the code has been practiced from "https://www.geeksforgeeks.org/doubly-linked-list/" .

class Node:
    def __init__(self, next=None, prev=None, data=None):
        self.next = next
        slef.prev = prev
        self.data = data
    def addatfront(self, info):
        newnode = Node(data = info)
        newnode.next = self.head
        newnode.prev = None
        if(self.head is not None):
            self.head.prev = newnode
        self.head = newnode
        
