package com.dio.de.linked_list;

public class LinkedList<T> {

	private Node<T> referenceNode = new Node<>();
	public static int index = 0;

	public Node<T> getReferenceNode() {
		return referenceNode;
	}

	public void setReferenceNode(Node<T> referenceNode) {
		this.referenceNode = referenceNode;
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		LinkedList.index = index;
	}

	// check if linked list is empty
	public boolean isEmpty() {
		return referenceNode.getNode() == null ? true : false;
	}

	public int add(Node<T> node) {
		/* if linked list is empty the input node is the referenced node */
		if (isEmpty()) {

			referenceNode.setNode(node);
			node.setIndex(LinkedList.index);

			return 0;

		}

		else {

			/*
			 * if linked list isn't empty the input node is the referenced node and it
			 * points to node which was being reference earlier
			 */


			node.setNode(referenceNode.getNode());
			LinkedList.index++;
			node.setIndex(LinkedList.index);
			referenceNode.setNode(node);
			System.out.println(node + " successful insertion!");
			System.out.println("reference: " + referenceNode.getNode());
			return 0;
		}
	}

	public int add(int index, Node<T> node) {

		Node<T> aux = referenceNode.getNode();

		/* if linked list is empty the input node is the referenced node */

		if (isEmpty()) {

			referenceNode.setNode(node);
			node.setIndex(LinkedList.index);
			System.out.println(node + " successful insertion!");
			System.out.println("reference: " + referenceNode.getNode());
			return 0;

		}

		else {
			/*
			 * if the input node will take the place of the first node, the input node must
			 * point to the first node and the first node must point to null
			 */
			if (aux.getIndex() == 0) {

				node.setNode(null);
				node.setIndex(0);
				LinkedList.index++;
				aux.setIndex(LinkedList.index);

				System.out.println(node + " successful insertion!");
				System.out.println("reference: " + referenceNode.getNode());
				return 0;

			}

			/*
			 * if the input node will take the place of the last node, the input node must
			 * point to the child of the last node and the last node must point to the input
			 * node
			 */
			if (aux.getIndex() == index) {

				node.setNode(aux.getNode());
				node.setIndex(aux.getIndex());
				LinkedList.index++;
				aux.setIndex(LinkedList.index);
				aux.setNode(node);
				System.out.println(node + " successful insertion!");
				System.out.println("reference: " + referenceNode.getNode());
				return 0;

			}

			if (aux.getIndex() != index) {

				/*
				 * if the index is not from the first node or the last node, it looks for the
				 * node that occupies it
				 */
				while (aux.getIndex() != index) {

					aux = aux.getNode();

					if (aux.getIndex() == index) {
						/*
						 * the input node receives the index and points to the child of the node that
						 * had that index previously
						 */
						node.setNode(aux.getNode());
						node.setIndex(aux.getIndex());
						LinkedList.index++;
						/* the node that had the index previously points to the input */
						aux.setNode(node);
						aux.setIndex(index);
						referenceNode.getNode().setIndex(++LinkedList.index);

						System.out.println(node + " successful insertion!");
						System.out.println("reference: " + referenceNode.getNode());

						break;
					}

				}

			}

			return 0;
		}

	}

	public int size() {
		int x = LinkedList.index;
		return ++x;
	}

}
