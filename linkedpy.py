class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class LinkedList:
    def __init__(self):
        self.start = None
    def insertend(self, value):
        newnode = node(value)
        if(self.start==None):
            self.start=newnode
        else:
            temp=self.start
            while temp.next!=None:
                temp = temp.next
            temp.next = newnode
    def delfrst(self):
        if(self.start==None):
            print("List is empty")
        else:
            self.start = temp.next
    def printlist(self):
        if(self.start==None):
            print("List is empty")
        else:
            temp = self.start
            while temp!=None:
                print(temp.data, end= ' ')
                temp=temp.next
mylist = LinkedList()
mylist.insert(4)
            
