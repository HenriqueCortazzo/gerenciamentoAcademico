package projetounifg;

import userActions.BancoDeDadosCreate;
import javax.swing.SwingUtilities;

public class ProjetoUnifg {

    public static void main(String[] args) {
        BancoDeDadosCreate bd = new BancoDeDadosCreate();
        bd.criarBancoDados();
        
        new telaCadastro().setVisible(true);
    }

}
