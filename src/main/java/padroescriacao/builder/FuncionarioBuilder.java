package padroescriacao.builder;

import java.util.Date;

public class FuncionarioBuilder {


    private Funcionario funcionario;

    public FuncionarioBuilder() {
        funcionario = new Funcionario();
    }

    public Funcionario build() {
        if (funcionario.getId() == 0) {
            throw new IllegalArgumentException("Id inválido");
        }
        if (funcionario.getNome() == null || funcionario.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (funcionario.getEmail() == null || !funcionario.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("Email inválido");
        }
        return funcionario;
    }

    public FuncionarioBuilder setId(int id) {
        funcionario.setId(id);
        return this;
    }

    public FuncionarioBuilder setNome(String nome) {
        funcionario.setNome(nome);
        return this;
    }


    public FuncionarioBuilder setDataNascimento(Date dataNascimento) {
        funcionario.setDataNascimento(dataNascimento);
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf) {
        funcionario.setCpf(cpf);
        return this;
    }

    public FuncionarioBuilder setRg(String rg) {
        funcionario.setRg(rg);
        return this;
    }

    public FuncionarioBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        funcionario.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public FuncionarioBuilder setEnderecoNumero(int enderecoNumero) {
        funcionario.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public FuncionarioBuilder setEnderecoComplemento(String enderecoComplemento) {
        funcionario.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public FuncionarioBuilder setEnderecoBairro(String enderecoBairro) {
        funcionario.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public FuncionarioBuilder setEnderecoCidade(String enderecoCidade) {
        funcionario.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public FuncionarioBuilder setEnderecoUF(String enderecoUF) {
        funcionario.setEnderecoUF(enderecoUF);
        return this;
    }

    public FuncionarioBuilder setCep(String cep) {
        funcionario.setCep(cep);
        return this;
    }

    public FuncionarioBuilder setEmail(String email) {
        funcionario.setEmail(email);
        return this;
    }

    public FuncionarioBuilder setCelular(String celular) {
        funcionario.setCelular(celular);
        return this;
    }
}
