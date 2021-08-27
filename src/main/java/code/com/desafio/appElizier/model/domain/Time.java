package code.com.desafio.appElizier.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//@Table(name = "nome da tabela") // nomear tabela
public class Time {
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 private String nome;//Flamengo, Real Madrid 
	 private int anoFundacao;//1895, 1902
	 private float valor;//R$3.000.000.000,00, R$10.000.000.000,00
	 private String siglaNacao;//BR, ES
	 private boolean clubeEmpresa;//uma organização sem fins lucrativos, um clube-empresa
	 
	 public Time() {
		 
		 this.valor = 999;
		 this.siglaNacao = "BR";
		 this.clubeEmpresa = true;
	 }
	 
	 public Time(String nome, int anoFundacao) {
		 
		 this();
		 this.nome = nome;
		 this.anoFundacao = anoFundacao;
	 }
	 
	 
	 public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	 public String toString() {
		return "Sou "+nome+", fundado em " + anoFundacao;
	}
   
	  	 
	 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoFundacao() {
		return anoFundacao;
	}
	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getSiglaNacao() {
		return siglaNacao;
	}
	public void setSiglaNacao(String siglaNacao) {
		this.siglaNacao = siglaNacao;
	}
	public boolean isClubeEmpresa() {
		return clubeEmpresa;
	}
	public void setClubeEmpresa(boolean clubeEmpresa) {
		this.clubeEmpresa = clubeEmpresa;
	}
		
}

