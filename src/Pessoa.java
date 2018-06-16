public class Pessoa{
    String nome = "Wesley";
    String cep = "87025-250";
    String endereco = "Av dos Anjos";
    String numero = "220";
    String complemento = "Apartamento 3º Andar";
    String bairro = "Jd massa";
    String cidade = "Maringa";
    String estado = "Paraná";
    String telefone = "44 9 98781380";



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String obterInformacao(){
        return "Nome: " + this.nome + ", CEP:" + this.cep + ", Endereço: " + this.endereco + ", Complemento: " + this.complemento + ", Numero: " + this.numero + ", Bairro: "
                + this.bairro + ", Cidade: " + this.cidade + ", Estado: " + this.estado + ", Telefone: " + this.telefone;
    }
}
