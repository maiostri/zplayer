import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

public class Zplayer extends javax.swing.JFrame implements Runnable {

    protected Playerpai player;
    private File arquivo; 
    private Thread t;
    private boolean flag;
    protected boolean flagt;
    private Tduracao td;

		       
	public Zplayer() {
		initComponents();
		Thread ct = Thread.currentThread();
		t = new Thread(this,"Player");

	}
	public void run() {
		try { 
                if (player.tocando()) player.parar();
                      flagt = true;
                      player.tocar(arquivo);
                      this.repaint();
                } 
		catch (Exception e) { e.printStackTrace(); } 
	}

	boolean Type(File arquivo) {
		String tmp = arquivo.getAbsolutePath();
		tmp = tmp.substring(tmp.indexOf(".")+1);
		return tmp.equalsIgnoreCase("mp3");
	} 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        sDuracao = new javax.swing.JSlider();
        bAbrir = new javax.swing.JButton();
        lArquivo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bPause = new javax.swing.JButton();
        bParar = new javax.swing.JButton();
        bAnterior = new javax.swing.JButton();
        bProximo = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        sVolume = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu(); 
        fEscolhe = new javax.swing.JFileChooser();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sDuracao.setValue(0);

        bAbrir.setText("Abrir");
        bAbrir.setName("bAbrir"); // NOI18N
        bAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAbrirActionPerformed(evt);
            }
        });

        lArquivo.setText("Arquivo: ");

        jLabel2.setText("");

        bPause.setText("Play/Pause");
        bPause.setName("bPause"); // NOI18N
        bPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPauseActionPerformed(evt);
            }
        });

        bParar.setText("Parar");
        bParar.setName("bParar"); // NOI18N
        bParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPararActionPerformed(evt);
            }
        });

        bAnterior.setText("Anterior");
        bAnterior.setName("bAnterior"); // NOI18N
        bAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnteriorActionPerformed(evt);
            }
        });

        bProximo.setText("Proximo");
        bProximo.setName("bProximo"); // NOI18N
        bProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProximoActionPerformed(evt);
            }
        });

        bSair.setText("Sair");
        bSair.setName("bSair"); // NOI18N
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        sVolume.setOrientation(javax.swing.JSlider.VERTICAL);

	sVolume.addChangeListener(new ChangeListener() {
	  public void stateChanged(ChangeEvent e) {
	     JSlider source = (JSlider)e.getSource();  
	     if (source.getValueIsAdjusting()) {
                   player.setVolume(sVolume.getValue());
             }
	  }
	});


        jLabel3.setText("Volume");

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Abrir musica");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir video");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Sair");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAbrir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPause)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bParar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bProximo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSair))
                            .addComponent(sDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(sVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lArquivo)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(sDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAbrir)
                            .addComponent(bPause)
                            .addComponent(bParar)
                            .addComponent(bAnterior)
                            .addComponent(bProximo)
                            .addComponent(bSair))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>



    private void bAbrirActionPerformed(java.awt.event.ActionEvent evt) {

		int res = fEscolhe.showOpenDialog(null);
                    if(res == javax.swing.JFileChooser.APPROVE_OPTION){
                        arquivo  = fEscolhe.getSelectedFile(); 
                        flag = Type(arquivo);
                        if (flag) player = new AudioPlayer();
                        else player = new VideoPlayer();
                        player.associar(arquivo);
                        t.start();
                        //System.out.println(player.percentual());
                        td = new Tduracao();
                        lArquivo.setText("Arquivo: "+arquivo.getName());
                    }  
    }

    private void bPauseActionPerformed(java.awt.event.ActionEvent evt) {
         player.pausar();
    }

    private void bPararActionPerformed(java.awt.event.ActionEvent evt) {
        player.parar();
    }

    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void bProximoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zplayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton bAbrir;
    private javax.swing.JButton bPause;
    private javax.swing.JButton bParar;
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bProximo;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel lArquivo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    protected javax.swing.JSlider sDuracao;
    private javax.swing.JFileChooser fEscolhe;
    private javax.swing.JSlider sVolume;
    // End of variables declaration

}

class Tduracao extends Zplayer implements Runnable {
         Tduracao() {
            Thread ct = Thread.currentThread();
            Thread t = new Thread(this,"duracao");
            t.start();
         } 


         public void run() {
            try {
                    Thread.sleep(10000);
                    int i = 0;
		    while (player.tocando()) {
                    System.out.println(player.percentual());
		    Thread.sleep(1000);
		   }
             }
		    catch (Exception e) { e.printStackTrace();}
          }  
//              sDuracao.setValue(player.percentual());            
         
}



