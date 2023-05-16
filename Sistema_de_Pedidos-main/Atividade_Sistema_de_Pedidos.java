import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Atividade_Sistema_de_Pedidos extends JPanel{
	
	
	/*
	 
	 by: Cauan de Paula, Gustavo Candido e Heleno Matos - 4SIT
	
	 */
	
	
	private JLabel lbpag, lblanches, lbacompanhamentos,lbbebidas,sizeWhopper,sizeCheddar,
	sizeBigking,sizeBatata,sizeOnion,sizeChicken,sizePepsi,sizeGuarana,sizeSuco, sizefundo,
	sizediv, sizediv2, sizediv3, sizecards, sizelg;
	private JButton btfinalizar;
	private JRadioButton rbcartao, rbdinheiro, rbvr;
	private ButtonGroup btGroup;
	private JCheckBox ckWhopper, ckCheddar, ckBigking, ckbatataf, ckonion, ckchiken, ckpepsi, ckguarana, cksuco;
	private ImageIcon imgWhopper, imgCheddar, imgBigking, imgBatata, imgOnion, imgChicken, imgPepsi, imgGuarana,
	imgSuco, imgfundo, div, div2, div3, imgcards, imglg;
	
	
	private JSpinner qtdL1, qtdL2, qtdL3, qtdA1, qtdA2, qtdA3, qtdB1, qtdB2, qtdB3;
	
	private SpinnerModel n1 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n2 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n3 = new SpinnerNumberModel(1, 0, 10, 1);
	
	private SpinnerModel n4 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n5 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n6 = new SpinnerNumberModel(1, 0, 10, 1);
	
	private SpinnerModel n7 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n8 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n9 = new SpinnerNumberModel(1, 0, 10, 1);
	
	
	public Atividade_Sistema_de_Pedidos(){
		inicializarComponentes();
		definirEventos(); 
	}
	
	private void inicializarComponentes() {
		
		imglg = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\bklog3.png");
		sizelg = new JLabel(imglg);
		imgcards = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\cards1.png");
		sizecards = new JLabel(imgcards);
		imgfundo = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\bklogo2.png");
		sizefundo = new JLabel(imgfundo);
		div = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\rest.png");
		sizediv = new JLabel(div);
		div2 = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\rest2.png");
		sizediv2 = new JLabel(div2);
		div3 = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\rest3.png");
		sizediv3 = new JLabel(div3);
		imgWhopper = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\whopper.png");
		sizeWhopper = new JLabel(imgWhopper);
		imgCheddar = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\Cheddar.png");
		sizeCheddar = new JLabel(imgCheddar);
		imgBigking = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\Bigking.png");
		sizeBigking = new JLabel(imgBigking);
		imgBatata = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\batata.png");
		sizeBatata = new JLabel(imgBatata);	
		imgOnion = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\Onion.png");
		sizeOnion = new JLabel(imgOnion);	
		imgChicken = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\chicken.png");
		sizeChicken = new JLabel(imgChicken);
		imgPepsi = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\Pepsi.png");
		sizePepsi = new JLabel(imgPepsi);
		imgGuarana = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\Guarana.png");
		sizeGuarana = new JLabel(imgGuarana);
		imgSuco = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\Suco.png");
		sizeSuco = new JLabel(imgSuco);
		
		lbpag = new JLabel("Formas de Pagamento:");
		lblanches = new JLabel("LANCHES:");
		lbacompanhamentos = new JLabel("ACOMPANHAMENTOS:");
		lbbebidas = new JLabel("BEBIDAS:");
		btfinalizar = new JButton("Finalizar Pedido");
		
		ckWhopper = new JCheckBox("Whopper (R$21,99)");
		ckCheddar = new JCheckBox("Bk Cheddar (R$14,50)");
		ckBigking = new JCheckBox("Big King (R$16,90)");
		ckbatataf = new JCheckBox("Batata Frita (R$08,50)");
		ckonion = new JCheckBox("Onion Rings (R$09,99)");
		ckchiken = new JCheckBox("BK Chicken (R$12,50)");
		ckpepsi = new JCheckBox("Pepsi (R$07,50)");
		ckguarana = new JCheckBox("Guaraná (R$07,50)");
		cksuco = new JCheckBox("Sufresh (R$05,00)");
		
	    qtdL1 = new JSpinner(n1);
	    qtdL2 = new JSpinner(n2);
	    qtdL3 = new JSpinner(n3);
	    
	    qtdA1 = new JSpinner(n4);
	    qtdA2 = new JSpinner(n5);
	    qtdA3 = new JSpinner(n6);
	    
	    qtdB1 = new JSpinner(n7);
	    qtdB2 = new JSpinner(n8);
	    qtdB3 = new JSpinner(n9);
		
		rbcartao = new JRadioButton("Cartão de Crédito/Débito");
		rbdinheiro = new JRadioButton("Dinheiro");
		rbvr = new JRadioButton("Vale-Refeição");
		btGroup = new ButtonGroup();
		
		btGroup.add(rbcartao);
		btGroup.add(rbdinheiro);
		btGroup.add(rbvr);

		setLayout(null);
		
		btfinalizar.setBounds(280,560,150,30);
		
		sizelg.setBounds(322, 5, 35, 35);
		sizecards.setBounds(0, 610, 700, 50);
		//sizefundo.setBounds(100, 30, 500, 500);
		sizediv.setBounds(0, 480, 850, 100);
		sizediv2.setBounds(0, 30, 850, 100);
		sizediv3.setBounds(0, 560, 850, 100);
		
		sizeWhopper.setBounds(60,145,95,85);
		sizeCheddar.setBounds(60,250,95,85);
		sizeBigking.setBounds(60,350,95,85);
		sizeBatata.setBounds(290,145,95,85);
		sizeOnion.setBounds(290,250,95,85);
		sizeChicken.setBounds(290,350,95,85);
		sizePepsi.setBounds(530,145,95,85);
		sizeGuarana.setBounds(530,250,95,85);
		sizeSuco.setBounds(530,350,95,85);
		
		lblanches.setBounds(80,90,100,40);
		lbacompanhamentos.setBounds(280,90,170,40);
		lbbebidas.setBounds(550,90,100,40);
		
		ckWhopper.setBounds(30,130,150,20);
		ckCheddar.setBounds(30,230,150,20);
		ckBigking.setBounds(30,330,140,20);
		
		qtdL1.setBounds(180,130,30,20);
		qtdL2.setBounds(180,230,30,20);
		qtdL3.setBounds(180,330,30,20);
		
		ckbatataf.setBounds(260,130,150,20);
		ckonion.setBounds(260,230,150,20);
		ckchiken.setBounds(260,330,150,20);
		
		qtdA1.setBounds(415,130,30,20);
		qtdA2.setBounds(415,230,30,20);
		qtdA3.setBounds(415,330,30,20);
		
		ckpepsi.setBounds(500,130,120,20);
		ckguarana.setBounds(500,230,140,20);
		cksuco.setBounds(500,330,140,20);
		
		qtdB1.setBounds(640,130,30,20);
		qtdB2.setBounds(640,230,30,20);
		qtdB3.setBounds(640,330,30,20);
		
		lbpag.setBounds(280,502,200,20);
		rbcartao.setBounds(130,530,180,20);
		rbdinheiro.setBounds(320,530,100,20);
		rbvr.setBounds(420,530,120,20);
		
		setBackground(Color.orange);
		rbcartao.setBackground(Color.orange);
		rbdinheiro.setBackground(Color.orange);
		rbvr.setBackground(Color.orange);
		
		ckWhopper.setBackground(Color.orange);
		ckCheddar.setBackground(Color.orange);
		ckBigking.setBackground(Color.orange);
		ckbatataf.setBackground(Color.orange);
		ckonion.setBackground(Color.orange);
		ckchiken.setBackground(Color.orange);
		ckpepsi.setBackground(Color.orange);
		ckguarana.setBackground(Color.orange);		
		cksuco.setBackground(Color.orange);
		
		btfinalizar.setBackground(Color.black);
		btfinalizar.setForeground(Color.orange);
		btfinalizar.setToolTipText("Definir pedido e calcular valor.");
		btfinalizar.setFont(new Font("AlNile", Font.BOLD, 14));

		lbpag.setFont(new Font("Arial", Font.BOLD, 14));
		lbpag.setForeground(Color.white);
		lblanches.setForeground(Color.white); //troca a cor do texto da label
		lblanches.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		lbacompanhamentos.setForeground(Color.white); //troca a cor do texto da label
		lbacompanhamentos.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		lbbebidas.setForeground(Color.white); //troca a cor do texto da label
		lbbebidas.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		
		add(btfinalizar);
		add(ckWhopper);
		add(ckCheddar);
		add(ckBigking);
		add(ckbatataf);
		add(ckonion);
		add(ckchiken);
		add(ckpepsi);
		add(ckguarana);
		add(cksuco);
		
		add(qtdL1);
		add(qtdL2);
		add(qtdL3);
		
		add(qtdA1);
		add(qtdA2);
		add(qtdA3);
		
		add(qtdB1);
		add(qtdB2);
		add(qtdB3);
		
		add(rbcartao);
		add(rbdinheiro);
		add(rbvr);
		
		add(lbpag);
		
		add(lblanches);
		add(lbacompanhamentos);
		add(lbbebidas);
		
		add(sizeWhopper);
		add(sizeCheddar);
		add(sizeBigking);
		add(sizeBatata);
		add(sizeOnion);
		add(sizeChicken);
		add(sizePepsi);
		add(sizeGuarana);
		add(sizeSuco);
		
		add(sizefundo);
		add(sizediv);
		add(sizediv2);
		add(sizediv3);
		add(sizecards);
		add(sizelg);
		
		qtdL1.setEnabled(false);
		qtdL2.setEnabled(false);
		qtdL3.setEnabled(false);
		
		qtdA1.setEnabled(false);
		qtdA2.setEnabled(false);
		qtdA3.setEnabled(false);
		
		qtdB1.setEnabled(false);
		qtdB2.setEnabled(false);
		qtdB3.setEnabled(false);
		
			
	}

	private void definirEventos(){
		ckWhopper.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				if(ckWhopper.isSelected()) {
					qtdL1.setEnabled(true);
				}else {
					qtdL1.setEnabled(false);
					qtdL1.setValue(0);
				}
				}});
		ckCheddar.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent b){
				if(ckCheddar.isSelected()) {
					qtdL2.setEnabled(true);
				}else {
					qtdL2.setEnabled(false);
					qtdL2.setValue(0);
				}
				}});
		
		ckBigking.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent c){
				if(ckBigking.isSelected()) {
					qtdL3.setEnabled(true);
				}else {
					qtdL3.setEnabled(false);
					qtdL3.setValue(0);
				}
				}});
		
		ckbatataf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent d){
				if(ckbatataf.isSelected()) {
					qtdA1.setEnabled(true);
				}else {
					qtdA1.setEnabled(false);
					qtdA1.setValue(0);
				}
				}});
		
		ckonion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(ckonion.isSelected()) {
					qtdA2.setEnabled(true);
				}else {
					qtdA2.setEnabled(false);
					qtdA2.setValue(0);
				}
				}});
		
		ckchiken.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent f){
				if(ckchiken.isSelected()) {
					qtdA3.setEnabled(true);
				}else {
					qtdA3.setEnabled(false);
					qtdA3.setValue(0);
				}
				}});
		
		ckpepsi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent g){
				if(ckpepsi.isSelected()) {
					qtdB1.setEnabled(true);
				}else {
					qtdB1.setEnabled(false);
					qtdB1.setValue(0);
				}
				}});
		
		ckguarana.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent h){
				if(ckguarana.isSelected()) {
					qtdB2.setEnabled(true);
				}else {
					qtdB2.setEnabled(false);
					qtdB2.setValue(0);
				}
				}});
		
		cksuco.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent i){
				if(cksuco.isSelected()) {
					qtdB3.setEnabled(true);
				}else {
					qtdB3.setEnabled(false);
					qtdB3.setValue(0);
				}
				}});
		
		btfinalizar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent j){
				
				DecimalFormat formatador = new DecimalFormat("0.00");
				String selecao = "Pedido: \n";
				
				double vtotalL = 0;
				double vtotalA = 0;
				double vtotalB = 0;
				double valortotal = 0;
				
				int ap1 = 0;
				int ap2 = 0;
				int ap3 = 0;
				int ap4 = 0;
				int ap5 = 0;
				int ap6 = 0;
				int ap7 = 0;
				int ap8 = 0;
				int ap9 = 0;
				
				if(ckWhopper.isSelected()) {
					ap1 = Integer.parseInt(qtdL1.getValue().toString());
					selecao += ap1 = Integer.parseInt(qtdL1.getValue().toString());
					selecao += "x Whopper\n";
					vtotalL = ap1 * 21.99;
				}
				if(ckCheddar.isSelected()) {
					ap2 = Integer.parseInt(qtdL2.getValue().toString());
					selecao += ap2 = Integer.parseInt(qtdL2.getValue().toString());
					selecao += "x Bk Cheddar\n";
					vtotalL = ap2 * 14.50;
				}

				if(ckBigking.isSelected()) {
					ap3 = Integer.parseInt(qtdL3.getValue().toString());
					selecao += ap3 = Integer.parseInt(qtdL3.getValue().toString());
					selecao += "x Big King\n";
					vtotalL = ap3 * 16.90;
				}

				if(ckbatataf.isSelected()) {
					ap4 = Integer.parseInt(qtdA1.getValue().toString());
					selecao += ap4 = Integer.parseInt(qtdA1.getValue().toString());
					selecao += "x Batata Frita\n";
					vtotalA = ap4 * 8.50;
				}

				if(ckonion.isSelected()) {
					ap5 = Integer.parseInt(qtdA2.getValue().toString());
					selecao += ap5 = Integer.parseInt(qtdA2.getValue().toString());
					selecao += "x Onion Rings\n";
					vtotalA = ap5 * 9.99;
				}

				if(ckchiken.isSelected()) {
					ap6 = Integer.parseInt(qtdA3.getValue().toString());
					selecao += ap6 = Integer.parseInt(qtdA3.getValue().toString());
					selecao += "x Chicken\n";
					vtotalA = ap6 * 12.50;
				}

				if(ckpepsi.isSelected()) {
					ap7 = Integer.parseInt(qtdB1.getValue().toString());
					selecao += ap7 = Integer.parseInt(qtdB1.getValue().toString());
					selecao += "x Pepsi\n";
					vtotalB = ap7 * 7.50;
				}

				if(ckguarana.isSelected()) {
					ap8 = Integer.parseInt(qtdB2.getValue().toString());
					selecao += ap8 = Integer.parseInt(qtdB2.getValue().toString());
					selecao += "x Guaraná Antarctica\n";
					vtotalB = ap8 * 7.50;
				}

				if(cksuco.isSelected()) {
					ap9 = Integer.parseInt(qtdB3.getValue().toString());
					selecao += ap9 = Integer.parseInt(qtdB3.getValue().toString());
					selecao += "x Sufresh/UVA\n";
					vtotalB = ap9 * 5;
				}
				 
				valortotal = vtotalL + vtotalA + vtotalB;
				if(btGroup.isSelected(null)||valortotal==0) {
					UIManager.getDefaults().put("OptionPane.background",new Color(255,215,0));
					UIManager.put ("Panel.background", new Color(255,215,0));
					UIManager.put("OptionPane.okButtonText", "Fechar");
					JOptionPane.showMessageDialog(null, "Pedido incompleto. Por favor, tente novamente.", "Erro",2);
				}else {
					if(rbdinheiro.isSelected()) {
						UIManager.getDefaults().put("OptionPane.background",new Color(255,215,0));
						UIManager.put ("Panel.background", new Color(255,215,0));
						UIManager.put("OptionPane.okButtonText", "Finalizar");
						ImageIcon icon = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\imoney.png");
						
						JOptionPane.showMessageDialog(null, selecao+ "\nValor total do Pedido: R$" + formatador.format(valortotal),"Pagamento em Dinheiro.",0,icon);
					}
					if(rbcartao.isSelected()) {
						UIManager.getDefaults().put("OptionPane.background",new Color(255,215,0));
						UIManager.put ("Panel.background", new Color(255,215,0));
						UIManager.put("OptionPane.okButtonText", "Finalizar");
						ImageIcon icon = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\icard.png");
						
						JOptionPane.showMessageDialog(null, selecao+ "\nValor total do Pedido: R$" + formatador.format(valortotal),"Pagamento com Cartão",0,icon);
						}
					if(rbvr.isSelected()) {
						UIManager.getDefaults().put("OptionPane.background",new Color(255,215,0));
						UIManager.put ("Panel.background", new Color(255,215,0));
						UIManager.put("OptionPane.okButtonText", "Finalizar");
						ImageIcon icon = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\icard.png");
						
						JOptionPane.showMessageDialog(null, selecao+ "\nValor total do Pedido: R$" + formatador.format(valortotal),"Pagamento com Vale Refeição",0,icon);
				}
					}
			
			
			}});
		}
	
	public static void main(String args[]){
	 		JFrame frame = new JFrame("Burguer King - Cardápio Digital");
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 frame.setResizable(false);
			 frame.getContentPane().add(new Atividade_Sistema_de_Pedidos());
			 frame.setBounds(350,0,710,710);
			 frame.setVisible(true);
			 Image Icone = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Gustavo\\Desktop\\imgs_lanche\\bklogo1.png"); 
			 frame.setIconImage(Icone);
			 
            
		 }
	}