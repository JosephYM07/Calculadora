import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JPanel Principal;
    private JPanel Cabecera;
    private JPanel Botonera;
    private JLabel ResultadoPrincipal;
    private JLabel ResultadoSecundario;
    private JButton DELLButton;
    private JButton EliminarNumeroMostrado;
    private JButton ClearError;
    private JButton NumeroSiete;
    private JButton NumeroCinco;
    private JButton NumeroOcho;
    private JButton NumeroNueve;
    private JButton NumeroSeis;
    private JButton NumeroCuatro;
    private JButton NumeroUno;
    private JButton NumeroDos;
    private JButton NumeroTres;
    private JButton NumeroCero;
    private JButton SignoComa;
    private JButton SignoMultiplicacion;
    private JButton SignoDivision;
    private JButton SignoResta;
    private JButton SignoSuma;
    private JButton SignoIgual;
    private JButton Porcentaje;
    private JButton InversoDelNumeroVisor;
    private JButton potenciaCuadrada;
    private JButton BotonSqrt;
    private JButton botonCos;
    private JButton botonInversoCos;
    private JButton botonSeno;
    private JButton botonInversoSeno;
    private JButton botonTan;
    private JButton botonInversoTan;
    private JRadioButton RADRadioButton;
    private JRadioButton DEGRadioButton;
    private boolean igual, inicio = true, operacion1, operacion2;
    private double a, b, c, cos, acos, sin, asin, tan, atan, resultado, valor1, valor2;
    private String cadena, funciones, tipoOperaciones;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calculadora calculadora = new Calculadora();
        frame.setContentPane(calculadora.Principal);
        frame.setSize(300, 400); // Establecer tamaño inicial
        frame.setResizable(false); // Bloquear redimensionamiento
        frame.setVisible(true);
    }

    public Calculadora() {
        //Boton DEG
        DEGRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (DEGRadioButton.isSelected()) {
                    RADRadioButton.setSelected(false);
                }
            }
        });
        //Boton  RAD
        RADRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RADRadioButton.isSelected()) {
                    DEGRadioButton.setSelected(false);
                }
            }
        });
        NumeroCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("");
                    ResultadoPrincipal.setText("0");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "0");
                }
            }
        });
        NumeroUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("");
                    ResultadoPrincipal.setText("1");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "1");
                }
            }
        });
        NumeroDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("");
                    ResultadoPrincipal.setText("2");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "2");
                }
            }
        });
        NumeroTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("");
                    ResultadoPrincipal.setText("3");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "3");
                }
            }
        });
        NumeroCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("");
                    ResultadoPrincipal.setText("4");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "4");
                }
            }
        });
        NumeroCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("");
                    ResultadoPrincipal.setText("5");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "5");
                }
            }
        });
        NumeroSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("");
                    ResultadoPrincipal.setText("6");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "6");
                }
            }
        });
        NumeroSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("7");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "7");
                }
            }
        });
        NumeroOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("8");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "8");
                }
            }
        });
        NumeroNueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    ResultadoPrincipal.setText("9");
                    inicio = false;
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + "9");
                }
            }
        });
        //Inicio Boton con la funcion punto decimal
        SignoComa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ResultadoPrincipal.getText().contains(".")) {
                    //No hacer nada
                } else {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText() + ".");
                    inicio = false;
                }
            }
        });
        //Boton SQRT
        BotonSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ResultadoPrincipal.getText().length() > 0) {
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    if (valor1 < 0) {
                        ResultadoPrincipal.setText("Error");
                    } else {
                        resultado = Math.sqrt(valor1);
                        ResultadoPrincipal.setText(String.valueOf(resultado));
                    }
                }
            }
        });
        //Boton potencia cuadrada
        potenciaCuadrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ResultadoPrincipal.getText().length() > 0) {
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    resultado = Math.pow(valor1, 2);
                    ResultadoPrincipal.setText(String.valueOf(resultado));
                }
            }
        });
        // Boton Porcentaje
        Porcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ResultadoPrincipal.getText().length() > 0) {
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    resultado = valor1 / 100;
                    ResultadoPrincipal.setText(String.valueOf(resultado));
                }
            }
        });
        // Boton DELL
        DELLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ResultadoPrincipal.getText().length() > 0) {
                    ResultadoPrincipal.setText(ResultadoPrincipal.getText().substring(0, ResultadoPrincipal.getText().length() - 1));
                    if (ResultadoPrincipal.getText().length() == 0) {
                        ResultadoPrincipal.setText("0");
                        inicio = true;
                    }
                }
            }
        });
        //Boton Clear
        EliminarNumeroMostrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultadoPrincipal.setText("0");
                ResultadoSecundario.setText("");
                inicio = true;
                funciones = "";
                operacion1 = true;
                operacion2 = true;
                igual = true;
                valor1 = 0;
                valor2 = 0;
                resultado = 0;
            }
        });
        // Boton CE
        ClearError.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultadoPrincipal.setText("0");
                ResultadoSecundario.setText("");
                inicio = true;
                funciones = "";
            }
        });
        //Boton Inversa
        InversoDelNumeroVisor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                ResultadoSecundario.setText("reciproc(" + valor1 + " )");
                ResultadoPrincipal.setText(1 / valor1 + " ");
            }
        });
        //TODO: OPERACIONES.
        //Inicio boton con la funcion de suma
        SignoSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                //Condicion para la variable Operacion1
                if (operacion1 == true) {
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText(ResultadoPrincipal.getText() + "");
                    ResultadoSecundario.setText(ResultadoPrincipal.getText() + " + ");
                    operacion2 = false;
                } else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("");
                        ResultadoSecundario.setText(ResultadoPrincipal.getText() + " + ");
                        operacion2 = false;
                    } else {
                        ResultadoSecundario.setText(ResultadoPrincipal.getText() + " + ");
                        Operaciones(resultado, valor2);
                    }
                }
                tipoOperaciones = "+";
            }
        });
        //Boton Resta
        SignoResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText("");
                    ResultadoSecundario.setText(ResultadoPrincipal.getText() + " - ");
                    operacion1 = false;
                } else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("");
                        ResultadoSecundario.setText(ResultadoPrincipal.getText() + " - ");
                        operacion2 = false;
                    } else {
                        ResultadoSecundario.setText(ResultadoPrincipal.getText() + " - ");
                        Operaciones(resultado, valor2);
                    }
                }
                tipoOperaciones = "-";
            }
        });
        //Boton Multiplicacion
        SignoMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText("");
                    ResultadoSecundario.setText(ResultadoPrincipal.getText() + " x ");
                    operacion1 = false;
                } else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("");
                        ResultadoSecundario.setText(ResultadoPrincipal.getText() + " x ");
                        operacion2 = false;
                    } else {
                        ResultadoSecundario.setText(ResultadoPrincipal.getText() + " x ");
                        Operaciones(resultado, valor2);
                    }

                }
                tipoOperaciones = "*";
            }
        });
        // Boton Division
        SignoDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText("");
                    ResultadoSecundario.setText(ResultadoPrincipal.getText() + " / ");
                    operacion1 = false;
                } else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("");
                        ResultadoSecundario.setText(ResultadoPrincipal.getText() + " / ");
                        operacion2 = false;
                    } else {
                        ResultadoSecundario.setText(ResultadoPrincipal.getText() + " / ");
                        Operaciones(resultado, valor2);
                    }
                }
                tipoOperaciones = "/";
            }
        });
        //Inicio boton igual
        SignoIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio = true;
                operacion1 = true;
                if (igual == true) {
                    if (tipoOperaciones == null) {

                    } else {
                        valor2 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText(ResultadoSecundario.getText() + ResultadoPrincipal.getText());
                        Operaciones(valor1, valor2);
                        igual = false;
                    }
                } else {
                    ResultadoSecundario.setText("");
                    Operaciones(valor1, valor2);
                }

            }
        });
        //Operaciones Trigonometricas
        //Inicio boton con la funcion de seno
        botonSeno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "sin";
                Trigonometria();
            }
        });
        //Inicio boton con la funcion de coseno
        botonCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "cos";
                Trigonometria();
            }
        });
        //Inicio boton con la funcion de tangente
        botonTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "tan";
                Trigonometria();
            }
        });
        //Boton inverso del coseno
        botonInversoCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "cos-1";
                Trigonometria();
            }
        });
        //Boton inverso del seno
        botonInversoSeno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "sen-1";
                Trigonometria();
            }
        });
        //Boton inverso de la tangente
        botonInversoTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "tan-1";
                Trigonometria();
            }
        });
    }

    // Case operaciones
    private void Operaciones(double valor1, double valor2) {
        switch (tipoOperaciones) {
            // Case con las funciones de sumar
            case "+":
                resultado = valor1 + valor2;
                ResultadoPrincipal.setText(resultado + "");
                valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                break;
            // Case con las funciones de restar
            case "-":
                resultado = valor1 - valor2;
                ResultadoPrincipal.setText(resultado + "");
                valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                break;
            // Case con las funciones de multiplicar
            case "*":
                resultado = valor1 * valor2;
                ResultadoPrincipal.setText(resultado + "");
                valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                break;
            // Case con las funciones de dividir
            case "/":
                if (valor2 == 0) {
                    ResultadoPrincipal.setText("Error ");
                    break;
                } else {
                    resultado = valor1 / valor2;
                    ResultadoPrincipal.setText(resultado + "");
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    break;
                }

                // Case con las funciones de elevar potencia
            case "potencia":
                resultado = Math.pow(valor1, valor2);
                ResultadoPrincipal.setText(resultado + "");
                break;

            // Case con las funciones de raiz de un numero x
            case "raizx":
                if (valor2 <= 0) {
                    ResultadoPrincipal.setText("Error ");
                    break;
                } else {
                    ResultadoSecundario.setText(valor2 + " yroot");
                    a = 1;
                    c = a / valor2;
                    ResultadoPrincipal.setText(Math.pow(valor1, c) + " ");
                    break;
                }
        }
    }

    //switch para las funciones trigonometricas
    private void Trigonometria() {
        if (RADRadioButton.isSelected()) {
            switch (funciones) {
                // Seno
                case "sin":
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText("sin( " + valor1 + " )");
                    sin = Math.sin(Math.PI * (valor1) / 180);
                    ResultadoPrincipal.setText(sin + " ");
                    break;
                // Seno Inverso
                case "asin":
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText("asin( " + valor1 + " )");
                    asin = Math.asin(((valor1) * 180) / Math.PI);
                    ResultadoPrincipal.setText(asin + " ");
                    break;
                // Coseno
                case "cos":
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText("cos( " + valor1 + " )");
                    cos = Math.cos(Math.PI * (valor1) / 180);
                    ResultadoPrincipal.setText(cos + " ");
                    break;
                // Coseno Inverso
                case "acos":
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText("acos( " + valor1 + " )");
                    acos = Math.acos(((valor1) * 180) / Math.PI);
                    ResultadoPrincipal.setText(acos + " ");
                    break;
                // Tangente
                case "tan":
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText("tan( " + valor1 + " )");
                    tan = Math.tan(Math.PI * (valor1) / 180);
                    ResultadoPrincipal.setText(tan + " ");
                    break;
                // Seno Inverso
                case "atan":
                    valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                    ResultadoSecundario.setText("atan( " + valor1 + " )");
                    atan = Math.atan(((valor1) * 180) / Math.PI);
                    ResultadoPrincipal.setText(atan + " ");
                    break;
            }
        } else {
            if (DEGRadioButton.isSelected()) {
                switch (funciones) {
                    // Seno
                    case "sin":
                        valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("sin_r( " + valor1 + " )");
                        sin = Math.sin(valor1);
                        ResultadoPrincipal.setText(sin + " ");
                        break;
                    // Seno Inverso
                    case "asin":
                        valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("asin_r( " + valor1 + " )");
                        asin = Math.asin(valor1);
                        ResultadoPrincipal.setText(asin + " ");
                        break;
                    // Coseno
                    case "cos":
                        valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("cos_r( " + valor1 + " )");
                        cos = Math.cos(valor1);
                        ResultadoPrincipal.setText(cos + " ");
                        break;
                    // Coseno Inverso
                    case "acos":
                        valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("acos_r( " + valor1 + " )");
                        acos = Math.acos(valor1);
                        ResultadoPrincipal.setText(acos + " ");
                        break;
                    // Tangente
                    case "tan":
                        valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("tan_r( " + valor1 + " )");
                        tan = Math.tan(valor1);
                        ResultadoPrincipal.setText(tan + " ");
                        break;
                    // Seno Inverso
                    case "atan":
                        valor1 = Double.parseDouble(ResultadoPrincipal.getText());
                        ResultadoSecundario.setText("atan_r( " + valor1 + " )");
                        atan = Math.atan(valor1);
                        ResultadoPrincipal.setText(atan + " ");
                        break;
                }
            }
        }
    }
}