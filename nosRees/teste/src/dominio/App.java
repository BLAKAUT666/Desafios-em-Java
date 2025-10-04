package dominio;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.Scanner;
import java.awt.event.MouseAdapter;

public class App{
    private JFrame frame;
    private JTextField textField;
    private JPanel panel;
    private JLabel label;
    private JButton add;
    private JButton all;
    private JButton exit;
    private JButton saveAll;
    private Font font;
    private File arquivo;
    private FileReader reader;
    private FileWriter writer;

    public App(){
        app();
    }

    private void app(){
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        add = new JButton("Adicionar Anotações");
        all = new JButton("Anotaçoes Salvas");
        font = new Font("Inter", Font.PLAIN, 30);
        exit = new JButton("Sair do app");
        textField = new JTextField();
        Insets margin = new Insets(10, 10, 10, 10);
        ImageIcon imageIcon = new ImageIcon("/home/blake/nosRees/teste/src/dominio/Image/icon.png");
        JButton button = new JButton();
        JButton b = new JButton();

        // frame
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setTitle("nosRess");
        frame.setIconImage(imageIcon.getImage());
        frame.add(panel);
        // panel
        Color backgroundColor = new Color(154, 146, 150);
        panel.setSize(200, 300);
        panel.setBackground(backgroundColor);
        panel.add(label);
        panel.add(add);
        panel.add(all);
        panel.add(exit);
        b.setVisible(false);
        panel.add(b);
        
        // title main
        Color colorTitle = new Color(255,255,255);
        label.setText("Anotaçoẽs");
        label.setForeground(colorTitle);
        label.setFont(font);
        // button add
        Color buttonColor = new Color(0 , 23, 34);
        add.setBackground(buttonColor);
        add.setFont(font);
        add.setMargin(margin);
        // mouse click
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                // tirando os buttons
                add.setVisible(false);
                all.setVisible(false);
                exit.setVisible(false);
                // add in panel
                panel.add(textField);
                panel.add(button);
                button.setVisible(false);
                label.setText("Coloque o nome da anotação");

                textField.setFont(font);
                textField.setForeground(buttonColor);
                textField.setPreferredSize(new Dimension(200, 40));

                // button to save
                JButton save = new JButton("Salvar");
                save.setBackground(buttonColor);
                save.setFont(font);
                save.setMargin(margin);

                panel.add(save);
                JTextField textUser = new JTextField();
                panel.add(textUser);
                textUser.setForeground(buttonColor);
                textUser.setPreferredSize(new Dimension(250, 250));
                textUser.setFont(font);

                save.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e){
                        try{
                            arquivo = new File(textField.getText() + ".txt");
                            // create file
                            boolean isCreate = arquivo.createNewFile();
                            
                            writer = new FileWriter(arquivo);
                            reader = new FileReader(arquivo);
                            // save all
                            saveAll = new JButton();
                            saveAll.setForeground(buttonColor);
                            saveAll.setFont(font);
                            saveAll.setMargin(margin);
                            panel.add(saveAll);

                            saveAll.addMouseListener(new MouseAdapter() {
                                    @Override
                                    public void mouseClicked(MouseEvent e){

                                        if(e.getClickCount() > 1){
                                            System.out.println("maior que um click");
                                        } else {
                                            System.out.println("menor que um click");
                                        }

                                        try {
                                            // escrevendo
                                            writer.write(textUser.getText());
                                        } catch (IOException e1) {
                                            e1.printStackTrace();
                                        }

                                        panel.add(b);
                                        b.setVisible(true);
                                        b.setText("Voltar ao menu");
                                        exit.setVisible(false);
                                        b.addMouseListener(new MouseAdapter() {
                                            @Override
                                            public void mouseClicked(MouseEvent e){
                                                textUser.setVisible(false);
                                                textField.setVisible(false);
                                                save.setVisible(false);
                                                saveAll.setVisible(false);
                                                b.setVisible(false);
                                                textUser.setVisible(false);
                                                textField.setVisible(false);

                                                add.setVisible(true);
                                                all.setVisible(true);
                                                exit.setVisible(true);
                                                label.setVisible(true);

                                                exit.setText("Sair");

                                                all.addMouseListener(new MouseAdapter() {
                                                    @Override
                                                    public void mouseClicked(MouseEvent e){
                                                        button.setText(textField.getText());
                                                        button.setVisible(true);
                                                        button.setBackground(buttonColor);
                                                        button.setFont(font);
                                                        button.setMargin(margin);
                                                        // excluindo items
                                                        all.setVisible(false);
                                                        add.setVisible(false);
                                                        label.setText("Todas as Anotaçoẽs");

                                                        panel.setComponentZOrder(button, 1);

                                                    }
                                                });
                                            }
                                        });
                                    }
                                });

                            if(isCreate == true){
                                System.out.println("\t Arquivo Criado com Sucesso!!");
                                System.out.println("[ name ]:: " + arquivo.getName());
                                System.out.println("[ Conteudo ]:: " + reader.read());
                                System.out.println("[ textUser ]:: " + textUser.getText());
                            }

                        } catch (IOException error){
                            error.printStackTrace();
                        }
                    }
                });
            }
        });

        // button all
        all.setFont(font);
        all.setBackground(buttonColor);
        all.setMargin(margin);
        // button exit
        exit.setBackground(buttonColor);
        exit.setFont(font);
        exit.setMargin(margin);

        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                frame.dispose();
                frame.setVisible(false);
            }
        });

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                all.setVisible(false);
                add.setVisible(false);
                label.setVisible(false);
            }
        });
    }
}