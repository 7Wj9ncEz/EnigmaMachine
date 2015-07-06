package views;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Lampboard extends JFrame{
	JPanel lampboard, lampboard1, lampboard2, lampboard3;
	JLabel A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U,
	V, W, X, Y, Z;
	public JPanel getLampboard (){
		
		lampboard1 = new JPanel();
		lampboard1.setLayout(new GridLayout(1,9));
		lampboard1.setBackground(Color.white);
		
		lampboard2 = new JPanel();
		lampboard2.setLayout(new GridLayout(1,8));
		lampboard2.setBackground(Color.white);
		
		lampboard3 = new JPanel();
		lampboard3.setLayout(new GridLayout(1,9));
		lampboard3.setBackground(Color.white);
		
		lampboard = new JPanel();
		lampboard.setLayout(new GridLayout(3,1));
		lampboard.setBackground(Color.black);
		
		A = new JLabel("A");
		A.setHorizontalAlignment(SwingConstants.CENTER);
		B = new JLabel("B");
		B.setHorizontalAlignment(SwingConstants.CENTER);
		C = new JLabel("C");
		C.setHorizontalAlignment(SwingConstants.CENTER);
		D = new JLabel("D");
		D.setHorizontalAlignment(SwingConstants.CENTER);
		E = new JLabel("E");
		E.setHorizontalAlignment(SwingConstants.CENTER);
		F = new JLabel("F");
		F.setHorizontalAlignment(SwingConstants.CENTER);
		G = new JLabel("G");
		G.setHorizontalAlignment(SwingConstants.CENTER);
		H = new JLabel("H");
		H.setHorizontalAlignment(SwingConstants.CENTER);
		I = new JLabel("I");
		I.setHorizontalAlignment(SwingConstants.CENTER);
		J = new JLabel("J");
		J.setHorizontalAlignment(SwingConstants.CENTER);
		K = new JLabel("K");
		K.setHorizontalAlignment(SwingConstants.CENTER);
		L = new JLabel("L");
		L.setHorizontalAlignment(SwingConstants.CENTER);
		M = new JLabel("M");
		M.setHorizontalAlignment(SwingConstants.CENTER);
		N = new JLabel("N");
		N.setHorizontalAlignment(SwingConstants.CENTER);
		O = new JLabel("O");
		O.setHorizontalAlignment(SwingConstants.CENTER);
		P = new JLabel("P");
		P.setHorizontalAlignment(SwingConstants.CENTER);
		Q = new JLabel("Q");
		Q.setHorizontalAlignment(SwingConstants.CENTER);
		R = new JLabel("R");
		R.setHorizontalAlignment(SwingConstants.CENTER);
		S = new JLabel("S");
		S.setHorizontalAlignment(SwingConstants.CENTER);
		T = new JLabel("T");
		T.setHorizontalAlignment(SwingConstants.CENTER);
		U = new JLabel("U");
		U.setHorizontalAlignment(SwingConstants.CENTER);
		V = new JLabel("V");
		V.setHorizontalAlignment(SwingConstants.CENTER);
		W = new JLabel("W");
		W.setHorizontalAlignment(SwingConstants.CENTER);
		X = new JLabel("X");
		X.setHorizontalAlignment(SwingConstants.CENTER);
		Y = new JLabel("Y");
		Y.setHorizontalAlignment(SwingConstants.CENTER);
		Z = new JLabel("Z");
		Z.setHorizontalAlignment(SwingConstants.CENTER);
		
		lampboard1.add(Q);
		lampboard1.add(W);
		lampboard1.add(E);
		lampboard1.add(R);
		lampboard1.add(T);
		lampboard1.add(Z);
		lampboard1.add(U);
		lampboard1.add(I);
		lampboard1.add(O);
		
		lampboard2.add(A);
		lampboard2.add(S);
		lampboard2.add(D);
		lampboard2.add(F);
		lampboard2.add(G);
		lampboard2.add(H);
		lampboard2.add(J);
		lampboard2.add(K);
		
		lampboard3.add(P);
		lampboard3.add(Y);
		lampboard3.add(X);
		lampboard3.add(C);
		lampboard3.add(V);
		lampboard3.add(B);
		lampboard3.add(N);
		lampboard3.add(M);
		lampboard3.add(L);
		
		lampboard.add(lampboard1);
		lampboard.add(lampboard2);
		lampboard.add(lampboard3);
		
		return lampboard;
	}

}
