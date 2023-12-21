ublic class Main {

		    public static void main(String[] args) {
		        // uncomment test code for algorithm 
		        // Figure 11.17 - add 10 as red node
		        // 4 and 10 get recolored to black to maintain RB rules
		        /*RedBlackTree rbtree = new RedBlackTree();
		        rbtree.insert(7);
		        rbtree.insert(4);
		        rbtree.insert(10);
		        
		        System.out.println("Red Black Tree Figure 11.17");
		        rbtree.printTree();
		        System.out.println("");
		        
		        // add 8 to force recolor
		        rbtree.insert(8);
		        System.out.println("Add 8- recolor event");
		        rbtree.printTree();
		        
		        System.out.println();
		        
		        // Figure 11.18
		        // recolor of nodes to maintain RB rules
		        RedBlackTree rbtree2 = new RedBlackTree();
		        rbtree2.insert(15);
		        rbtree2.insert(7);
		        rbtree2.insert(20);
		        rbtree2.insert(4);
		        rbtree2.insert(10);
		        
		        System.out.println("Red Black Tree Figure 11.18");
		        rbtree2.printTree();
		        System.out.println("");
		        
		        // add 5 to force recolor
		        rbtree2.insert(5);
		        System.out.println("Add 5 - recolor event");
		        rbtree2.printTree();
		        
		        System.out.println();
		        
		        // Figure 11.19
		        // remove node 20 - causes rotate and recolor
		        RedBlackTree rbtree3 = new RedBlackTree();
		        rbtree3.insert(15);
		        rbtree3.insert(7);
		        rbtree3.insert(20);
		        rbtree3.insert(4);
		        rbtree3.insert(10);
		        rbtree3.insert(5);
		        rbtree3.insert(12);
		        
		        System.out.println("Red Black Tree Figure 11.19");
		        rbtree3.printTree();
		        System.out.println("");
		        
		        // delete node 20 to force rotate and recolor
		        System.out.println("Delete node 20 - rotate and recolor");
		        rbtree3.deleteNode(20);
		        
		        System.out.println();
		        System.out.println("11.19 Rebalanced Red Black Tree");
		        rbtree3.printTree();
		        */
		        
		        RedBlackTree rbtree4 = new RedBlackTree();
		        
		        for (int i=1; i < 20000; i++) {
		        	rbtree4.insert(i);
		        }
		      
		        rbtree4.printTree();
		        System.out.println("Red Black Tree Height" +  " " + rbtree4.height());
		    }
		 
		

		// old
//		        RedBlackTree bst = new RedBlackTree();
//		        bst.insert(55);
//		        bst.insert(40);
//		        bst.insert(65);
//		        bst.insert(60);
//		        bst.insert(75);
//		        bst.insert(57);
//		        bst.printTree();
		//
//		        System.out.println("\nAfter deleting:");
//		        bst.deleteNode(40);
//		        bst.printTree();

		 
//		        // Create RB Tree of 50,25, 75
//		        // Insert 10 to show recolor event
//		          RedBlackTree rbtree = new RedBlackTree();
//		          rbtree.insert(50);
//		          rbtree.insert(25);
//		          rbtree.insert(75);
//		          
//		          System.out.println("RB Tree with 50, 25 and 75");
//		          rbtree.printTree();
//		          
//		          System.out.println("");
//		          rbtree.insert(10);
//		          System.out.println("Tree after adding 10");
//		          rbtree.printTree();
//		          
//		          System.out.println();
//		          
//		          // let's cause a left rotate event
//		          // use same tree again but change 75 color to black using search
//		          // and then add 10 node
//		          // 10 should attack to node 25 which is red
//		          // then we'll call fixInsert directly :)
//		          RedBlackTree rbtree2 = new RedBlackTree();
//		          rbtree2.insert(50);
//		          rbtree2.insert(25);
//		          rbtree2.insert(75);
//		          Node node75 = rbtree2.searchTree(75);
//		          node75.setColor(0); // 0 is black
//		          rbtree2.insert(10);
//		          
//		          System.out.println("RB Tree 2 with 75 as black node");
//		          rbtree2.printTree();
//		          
//		          // insert 10 which will cause rotation
//		          rbtree2.insert(10);
//		          
//		          System.out.println();
//		          System.out.println("RB Tree 2");
//		          rbtree2.printTree();
	}

