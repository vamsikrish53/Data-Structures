class Node
{
  int data;
  Node next;

  Node(int data)
  {
    this.data = data;
    this.next = null;
  }
}

class LinkedList
{
  Node headNode;

  public void insertAtBeg(int data)
  {
    Node node = new Node(data);
    node.next = headNode;
    headNode = node;
  }

  public void insertAtEnd(int data)
  {
    Node node = headNode;
    Node ele = new Node(data);

    if (node == null)
    {
      headNode = ele;
      return;
    }

    while (node.next != null)
    {
      node = node.next;
    }

    node.next = ele;
  }

  public void insertAtPos(int data, int pos)
  {
    Node head = headNode;
    Node newNode = new Node(data);
    if (pos < 1)
    {
      System.out.println("Invalid Positio");
    }
    if (pos == 1)
    {
      newNode.next = headNode;
      head = newNode;
    } else
    {
      while (pos-- != 0)
      {
        if (pos == 1)
        {
          newNode.next = head.next;
          head.next = newNode;
          break;
        }
        head = head.next;
      }
      if (pos != 1)
      {
        System.out.println("Position out of range");
      }
    }
  }

  public void deleteAtBeg()
  {
    Node node = headNode;
    headNode = node.next;
  }

  public void deleteAtEnd()
  {
    Node node = headNode;

    if (node == null || node.next == null)
    {
      return;
    }

    while (node.next.next != null)
    {
      node = node.next;
    }
    node.next = null;
  }

  public void deleteAtPos(int pos)
  {
    Node head = headNode;
    if (pos < 1)
    {
      System.out.println("Invalid Positio");
    }
    if (pos == 1)
    {
      head = head.next;
    }
    else
    {
      while (pos-- != 0)
      {
        if (pos == 1)
        {
          head.next = head.next.next;
          break;
        }
        head = head.next;
      }
      if (pos != 1)
      {
        System.out.println("Position out of range");
      }
    }
  }

  public void print()
  {
    Node node = headNode;
    while (node != null)
    {
      System.out.print(node.data + "->");
      node = node.next;
    }
  }
}

public class LinkedListBasicOperations
{
  public static void main(String args[])
  {
    LinkedList ll = new LinkedList();

    ll.insertAtBeg(7);
    ll.insertAtBeg(6);
    ll.insertAtBeg(5);
    ll.insertAtBeg(4);
    ll.insertAtBeg(3);
    ll.insertAtBeg(2);
    ll.insertAtBeg(1);

    ll.insertAtEnd(8);
    ll.insertAtEnd(9);

    ll.deleteAtBeg();

    ll.deleteAtEnd();

    ll.insertAtPos(10, 3);

    ll.deleteAtPos(5);
    ll.deleteAtPos(4);

    ll.print();
  }

}
