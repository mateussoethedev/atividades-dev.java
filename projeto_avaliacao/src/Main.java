import java.sql.Connection;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList();
        ArrayList<carro> carro = new ArrayList();
        String opcao = "";
        String placa = "";
        System.out.println("inicio");

        while (!"5".equals(opcao)) {
            opcao = JOptionPane.showInputDialog(null,
                    "\n [1] Cadastrar pessoa \n" +
                            "\n [2] Cadastrar carro \n" +
                            "\n [3] Consultar pessoa \n" +
                            "\n [4] Consultar carro \n" +
                            "\n [5] Sair \n");
            if ("1".equals(opcao)) {

                String nome = JOptionPane.showInputDialog(null,
                        "Digite o nome da pessoa : ");
                String idadex = JOptionPane.showInputDialog(null,
                        "Digite a idade da pessoa : ");
                String codigo = JOptionPane.showInputDialog(null,
                        "Digite o codigo : ");
                Pessoa p = new Pessoa();
                p.setCodigoPessoa(Integer.parseInt(codigo));
                p.setNome(nome);
                p.setIdade(Integer.parseInt(idadex));
                pessoas.add(p);

            }
            if ("2".equals(opcao)) {
                String nomex = JOptionPane.showInputDialog(null,
                        "Digite o nome do carro : ");
                String Placa = JOptionPane.showInputDialog(null,
                        "Digite a placa do carro : ");
                String chassi = JOptionPane.showInputDialog(null,
                        "Digite o chassi do carro : ");
                String marca = JOptionPane.showInputDialog(null, "" +
                        "Digite o nome da Marca : ");
                carro c = new carro();
                c.setCodigo(Integer.parseInt(chassi));
                c.setMarca(marca);
                c.setNomeCarro(nomex);
                c.setPlaca(Placa);
                carro.add(c);
            }
            if ("3".equals(opcao)) {
                int c = 0;
                while (c < pessoas.size()) {
                    int r = 0;
                    while (r < pessoas.size() - 1) {
                        Pessoa px = (Pessoa) pessoas.get(r);
                        Pessoa px1 = (Pessoa) pessoas.get(r + 1);
                        if (px.getCodigoPessoa() < px1.getCodigoPessoa()) {
                            pessoas.set(r, px1);
                            pessoas.set(r + 1, px);
                        }
                        r++;
                    }
                    c++;
                }
                String pessoaVil = "";
                for (Pessoa p : pessoas) {
                    pessoaVil += p + "\n";
                }
                JOptionPane.showMessageDialog(null, "essa e a ordem" + pessoas);
            }if ("4".equals(opcao)) {
                    int a = 0;
                    while (a < carro.size()) {
                        int b = 0;
                        while (b < carro.size() - 1) {
                            carro cx = (carro) carro.get(b);
                            carro cx1 = (carro) carro.get(b + 1);
                            if (cx.getCodigo() < cx1.getCodigo()) {
                                carro.set(b, cx1);
                                carro.set(b + 1, cx);
                            }
                            b++;
                        }
                        a++;
                    }
                    String carroVil="";
                    for (carro carro1 : carro) {
                        carroVil += carro1 + "\n";
                    }
                    JOptionPane.showMessageDialog(null,"essa e a ordem : "+ carro);
                    }
                }

            }
        }
