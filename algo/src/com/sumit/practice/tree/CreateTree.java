package com.sumit.practice.tree;

import java.util.Stack;

import com.sumit.practice.linklist.FileOperation;

public class CreateTree {

	
	static TreeNode tree = null;
	
	private TreeNode myTree;
	
	/*public static void main(String[] args){
		CreateTree ct = new CreateTree();
		//ct.inOrderUsingStack(ct.getMyTree());
		ct.preOrderUsingStack(ct.getMyTree());
	}
*/
	
	public TreeNode getMyTree() {
		return myTree;
	}

	public void setMyTree(TreeNode myTree) {
		this.myTree = myTree;
	}

	public CreateTree(String fileName){
		FileOperation f = new FileOperation();
		TreeNode tr = null;
		for(String s : f.getFileData(fileName)){
			Integer data = Integer.parseInt(s);
			tr = createTree(tr,data);
		}
		setMyTree(tr);
	}
	
	public TreeNode createTree(TreeNode node,int data){
		TreeNode tn = new TreeNode(data);
		if(node == null){
			node = tn;
		}else if(node.getData() < data){
			node.setRight(createTree(node.getRight(), data));
		}else if(node.getData() > data){
			node.setLeft(createTree(node.getLeft(), data));
		}
		return node;
	}
	
	/*public void createTree1(int data){
		TreeNode tn = new TreeNode(data);
		boolean left = false;
		boolean right = false;
		if(tree == null){
			tree = tn;
		}else{
			while(tree!=null){
				if(tree.getData() > data){
					tree = tree.getLeft();
					left = true;
					right = false;
				}
				else if(tree.getData() < data){
					tree = tree.getRight();
					left = false;
					right = true;
				}
			}
			if(left){
				tree.setLeft(tn);
			}else if(right){
				tree.setRight(tn);
			}
		}
		
		//return tree;
		
	}*/
	public int size(TreeNode node){
		if(node == null){
			return 0;
		}
		return 1+size(node.getLeft())+size(node.getRight());
	}
	public void inOrder(TreeNode tree){
		if(tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getData()+"-->");
			inOrder(tree.getRight());
		}
	}
	
	public void preOrder(TreeNode tree){
		if(tree != null){
			System.out.print(tree.getData()+"-->");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}
	
	public void postOrder(TreeNode tree){
		if(tree != null){
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getData()+"-->");
		}
	}
	
	
	public void inOrderUsingStack(TreeNode tn){
		Stack<TreeNode> st = new Stack<TreeNode>();
		st.push(tn);
		while(true){
			if(st.empty()){
				break;
			}
			if(tn.getLeft() != null){
				st.push(tn.getLeft());
				tn = tn.getLeft();
			}else{
				tn = st.peek();
				st.pop();
				System.out.print(tn.getData()+"->");
				if(tn.getRight() != null){
					st.push(tn.getRight());
					tn = tn.getRight();
				}
			}
		}
	}
	
	
	public void preOrderUsingStack(TreeNode tn){
		Stack<TreeNode> st = new Stack<TreeNode>();
		st.push(tn);
		while(true){
			if(st.empty()){
				break;
			}
			tn = st.peek();
			st.pop();
			System.out.print(tn.getData()+"-->");
			if(tn.getLeft() != null){
				st.push(tn.getLeft());
				//tn = tn.getLeft();
			}
			if(tn.getRight() != null){
				st.push(tn.getRight());
				//tn = tn.getRight();
			}
		}
	}
}
