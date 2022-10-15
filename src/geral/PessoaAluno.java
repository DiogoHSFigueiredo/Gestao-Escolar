/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geral;

/**
 *
 * @author Diogo
 */
public class PessoaAluno {

    private String nome, janeiro, fevereiro, marco, abril, maio, 
            junho, julho, agosto, setembro, outubro, 
            novembro, dezembro;
    private int id, idade;

    public String Marco() {
          int x =  Integer.parseInt(marco);
              
        if (x == 0) {
            marco = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            marco = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
                return marco;
    }

    public void setMarco(String marco) {
        this.marco = marco;
    }

    public String Abril() {
              int x =  Integer.parseInt(abril);
              
        if (x == 0) {
            abril = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            abril = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return abril;
    }

    public void setAbril(String abril) {
        this.abril = abril;
    }

    public String Maio() {
              int x =  Integer.parseInt(maio);
              
        if (x == 0) {
            maio = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            maio = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return maio;
    }

    public void setMaio(String maio) {
        this.maio = maio;
    }

    public String Junho() {
              int x =  Integer.parseInt(junho);
              
        if (x == 0) {
            junho = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            junho = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return junho;
    }

    public void setJunho(String junho) {
        this.junho = junho;
    }

    public String Julho() {
              int x =  Integer.parseInt(julho);
              
        if (x == 0) {
            julho = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            julho = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return julho;
    }

    public void setJulho(String julho) {
        this.julho = julho;
    }

    public String Agosto() {
              int x =  Integer.parseInt(agosto);
              
        if (x == 0) {
            agosto = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            agosto = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return agosto;
    }

    public void setAgosto(String agosto) {
        this.agosto = agosto;
    }

    public String Setembro() {
              int x =  Integer.parseInt(setembro);
              
        if (x == 0) {
            setembro = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            setembro = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return setembro;
    }

    public void setSetembro(String setembro) {
        this.setembro = setembro;
    }

    public String Outubro() {
              int x =  Integer.parseInt(outubro);
              
        if (x == 0) {
            outubro = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            outubro = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return outubro;
    }

    public void setOutubro(String outubro) {
        this.outubro = outubro;
    }

    public String Novembro() {
              int x =  Integer.parseInt(novembro);
              
        if (x == 0) {
            novembro = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            novembro = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return novembro;
    }

    public void setNovembro(String novembro) {
        this.novembro = novembro;
    }

    public String Dezembro() {
              int x =  Integer.parseInt(dezembro);
              
        if (x == 0) {
            dezembro = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            dezembro = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return dezembro;
    }

    public void setDezembro(String dezembro) {
        this.dezembro = dezembro;
    }

    public String Janeiro() {
        int x =  Integer.parseInt(janeiro);
              
        if (x == 0) {
            janeiro = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            janeiro = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return janeiro;
    }

    public void setJaneiro(String janeiro) {
        this.janeiro = janeiro;
    }

    public String Fevereiro() {
              int x =  Integer.parseInt(fevereiro);
              
        if (x == 0) {
            fevereiro = "<html><font color=\"#FF0000\">ABERTO</font></html>";
        } else {
            fevereiro = "<html><font color=\"#00BFFF\">Pago</font></html>";
        }
        return fevereiro;
    }

    public void setFevereiro(String fevereireo) {
        this.fevereiro = fevereireo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
