import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class Calculator_App {
        public static void main(String[] args) {
                final int[][] clicked1Count = {{0}};
                ArrayList<String> operators = new ArrayList<String>();
                ArrayList<String> terms = new ArrayList<String>();
                JTextField textBar = new JTextField();
                textBar.setBounds(150, 0, 300, 50);
                textBar.setEditable(false);
                final int[] num1 = new int[1];
                int num2 = 0;

                //NUMBER BUTTONS

                JButton Butt = new JButton(String.valueOf(1));
                Butt.setBounds(100, 100, 100, 100);
                Butt.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                clicked1Count[0][0]++;
                                textBar.setText((textBar.getText().concat(String.valueOf(1))));
                                /*String ones = new String(new char[clicked1Count[0]]).replace('\0', '1');
                                terms.add(ones);
                                terms.add("1");*/
                                StringBuilder ones = new StringBuilder();
                                for (int i = 0; i < clicked1Count[0][0]; i++) {
                                        ones.append("1");
                                }
                                terms.add(ones.toString());
                                //terms.add(terms.get(terms.size() - 1));
                                System.out.println(terms);
                        }

                });

                JButton Butt2 = new JButton();
                Butt2.setBounds(100, 200, 100, 100);
                Butt2.setText("2");
                Butt2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textBar.setText((textBar.getText().concat(String.valueOf(2))));


                        }
                });

                JButton Butt3 = new JButton();
                Butt3.setBounds(100,300,100,100);
                Butt3.setText("3");
                Butt3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textBar.setText((textBar.getText().concat(String.valueOf(3))));
                        }
                });

                JButton Butt4 = new JButton();
                Butt4.setBounds(200, 100, 100, 100);
                Butt4.setText("4");
                Butt4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textBar.setText((textBar.getText().concat(String.valueOf(4))));
                        }
                });

                JButton Butt5 = new JButton();
                Butt5.setBounds(200,200,100,100);
                Butt5.setText("5");
                Butt5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textBar.setText((textBar.getText().concat(String.valueOf(5))));
                        }
                });

                JButton Butt6 = new JButton();
                Butt6.setBounds(200,300,100,100);
                Butt6.setText("6");
                Butt6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textBar.setText((textBar.getText().concat(String.valueOf(6))));
                        }
                });

                JButton Butt7 = new JButton();
                Butt7.setBounds(300,100,100,100);
                Butt7.setText("7");
                Butt7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textBar.setText((textBar.getText().concat(String.valueOf(7))));
                        }
                });

                JButton Butt8 = new JButton();
                Butt8.setBounds(300,200,100,100);
                Butt8.setText("8");
                Butt8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textBar.setText((textBar.getText().concat(String.valueOf(8))));
                        }
                });

                JButton Butt9 = new JButton();
                Butt9.setBounds(300,300,100,100);
                Butt9.setText("9");
                Butt9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textBar.setText((textBar.getText().concat(String.valueOf(9))));
                        }
                });

                //OPERATOR BUTTONS

                /*JButton MinusButt = new JButton();
                MinusButt.setBounds(0,300,100,100);
                MinusButt.setText("-");
                MinusButt.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textBar.setText(textBar.getText().concat("-"));
                                operators.add("-");
                                clicked1Count[0] = new int[]{0};
                        }
                });*/

                JButton MinusButt = new JButton();
                MinusButt.setBounds(0,300,100,100);
                MinusButt.setText("-");
                MinusButt.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                num1[0] = Integer.parseInt(textBar.getText());
                                System.out.println(num1[0] + "num1");
                                textBar.setText("");
                                operators.add("-");
                        }
                });

                JButton PlusButt = new JButton();
                PlusButt.setBounds(0,200,100,100);
                PlusButt.setText("+");
                PlusButt.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                num1[0] = Integer.parseInt(textBar.getText());
                                System.out.println(num1[0] + "num1");
                                textBar.setText("");
                                operators.add("+");
                                //clicked1Count[0] = new int[]{0};

                        }
                });

                JButton DivButt = new JButton();
                DivButt.setBounds(100,400,100,100);
                DivButt.setText("/");
                DivButt.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                num1[0] = Integer.parseInt(textBar.getText());
                                System.out.println(num1[0] + "num1");
                                textBar.setText("");
                                operators.add("/");
                        }
                });

                JButton MulButt = new JButton();
                MulButt.setBounds(200,400,100,100);
                MulButt.setText("*");
                MulButt.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                num1[0] = Integer.parseInt(textBar.getText());
                                System.out.println(num1[0] + "num1");
                                textBar.setText("");
                                operators.add("*");
                        }
                });

                JButton ClearButt = new JButton();
                ClearButt.setBounds(0,100,100,100);
                ClearButt.setText("Clr");
                ClearButt.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                terms.clear();
                                operators.clear();
                                textBar.setText("");
                                clicked1Count[0] = new int[]{0};
                                System.out.println(terms);
                                System.out.println(operators);
                        }
                });


                JButton EqualButton = new JButton();
                EqualButton.setBounds(0,400, 100,100);
                EqualButton.setText("=");
                EqualButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                //textBar.setText(textBar.getText().concat("="));
                                int num2 = Integer.parseInt(textBar.getText());
                                operators.add("=");
                                //int num1 = Integer.parseInt((terms.get(terms.size() - 2)));
                                //int num2 = Integer.parseInt((terms.get(terms.size() - 1)));
                                int result = 0;
                                if (operators.get(0) == String.valueOf(("+")))
                                        result = num1[0] + num2;
                                if (operators.get(0) == String.valueOf("-"))
                                        result = num1[0] - num2;
                                if (operators.get(0) == String.valueOf("/"))
                                        result = num1[0]/num2;
                                if (operators.get(0) == String.valueOf("*"))
                                        result = num1[0] * num2;
                                textBar.setText("");
                                textBar.setText(textBar.getText().concat(String.valueOf(result)));
                                System.out.println(num1[0] + "Num1" + " " + num2 + "num2");
                                System.out.println(result);
                        }
                });



                JFrame f = new JFrame("Calculator App");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLayout(null);
                f.setSize(500, 600);
                f.setVisible(true);
                f.add(Butt);
                f.add(Butt2);
                f.add(Butt3);
                f.add(Butt4);
                f.add(Butt5);
                f.add(Butt6);
                f.add(Butt7);
                f.add(Butt8);
                f.add(Butt9);
                f.add(PlusButt);
                f.add(MinusButt);
                f.add(EqualButton);
                f.add(MulButt);
                f.add(ClearButt);
                f.add(DivButt);
                f.add(textBar);
        }
}
