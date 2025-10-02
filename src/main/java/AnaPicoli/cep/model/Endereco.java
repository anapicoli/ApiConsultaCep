package AnaPicoli.cep.model;

import lombok.Data;

@Data
public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade; // cidade
    private String uf; // estado
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
}