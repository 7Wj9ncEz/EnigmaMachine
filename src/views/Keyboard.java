package views;

import java.awt.Color;

import javax.swing.*;

@SuppressWarnings("serial")
public class Keyboard extends JFrame{
	JButton A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U,
	V, W, X, Y, Z;
	JPanel keyboard, keyboard1, keyboard2, keyboard3;
	
	public JPanel getKeyboard (){
		A = new JButton("A");
		B = new JButton("B");
		C = new JButton("C");
		D = new JButton("D");
		E = new JButton("E");
		F = new JButton("F");
		G = new JButton("G");
		H = new JButton("H");
		I = new JButton("I");
		J = new JButton("J");
		K = new JButton("K");
		L = new JButton("L");
		M = new JButton("M");
		N = new JButton("N");
		O = new JButton("O");
		P = new JButton("P");
		Q = new JButton("Q");
		R = new JButton("R");
		S = new JButton("S");
		T = new JButton("T");
		U = new JButton("U");
		V = new JButton("V");
		W = new JButton("W");
		X = new JButton("X");
		Y = new JButton("Y");
		Z = new JButton("Z");
		
		keyboard1 = new JPanel();
		keyboard1.setBackground(Color.lightGray);
		
		keyboard2 = new JPanel();
		keyboard2.setBackground(Color.lightGray);
		
		keyboard3 = new JPanel();
		keyboard3.setBackground(Color.lightGray);
		
		keyboard = new JPanel();
		keyboard.setBackground(Color.lightGray);
		
			
		keyboard1.add(Q);
		keyboard1.add(W);
		keyboard1.add(E);
		keyboard1.add(R);
		keyboard1.add(T);
		keyboard1.add(Z);
		keyboard1.add(U);
		keyboard1.add(I);
		keyboard1.add(O);
		
		keyboard2.add(A);
		keyboard2.add(S);
		keyboard2.add(D);
		keyboard2.add(F);
		keyboard2.add(G);
		keyboard2.add(H);
		keyboard2.add(J);
		keyboard2.add(K);
		
		keyboard3.add(P);
		keyboard3.add(Y);
		keyboard3.add(X);
		keyboard3.add(C);
		keyboard3.add(V);
		keyboard3.add(B);
		keyboard3.add(N);
		keyboard3.add(M);
		keyboard3.add(L);
		
		keyboard.add(keyboard1);
		keyboard.add(keyboard2);
		keyboard.add(keyboard3);

		
		return keyboard;
		
	}

}
