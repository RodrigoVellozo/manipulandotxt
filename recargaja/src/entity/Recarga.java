package entity;

public class Recarga {
	private String data;
	private Integer recarga;
	private String status;
	
	public Recarga() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recarga(String data, Integer recarga, String status) {
		super();
		this.data = data;
		this.recarga = recarga;
		this.status = status;
	}
	public String getData() {
		return data;
	}
	public void setData(String string) {
		this.data = string;
	}
	public Integer getRecarga() {
		return recarga;
	}
	public void setRecarga(Integer recarga) {
		this.recarga = recarga;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return data+" 00:00:00 - recarga #"+recarga+" status #"+status;
	}

}
