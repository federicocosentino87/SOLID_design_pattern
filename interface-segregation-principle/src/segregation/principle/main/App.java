package segregation.principle.main;

import segregation.principle.tree.Tree;
import segregation.principle.tree.impl.BalancedTreeImpl;
import segregation.principle.tree.impl.BinarySearchTreeImpl;

public class App {

	/*
	 * I - Interface segregation principle
	 *
	 * is not good if interface contains lots of method, is good to separate them
	 *
	 * no client should depends on methods he doesn't use
	 *
	 * better separate interfaces into smaller methods, so they better satisfy the nedds of our clients
	 *
	 */

	public static void main(String[] args) {

		Tree binarySearchTree = new BinarySearchTreeImpl();
		Tree balancedTree = new BalancedTreeImpl();

	}

}
