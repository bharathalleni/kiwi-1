package org.oncoblocks.web.dao;

public class Gene {
	private int id;
	private String entrez_gene_id;
	private String summary;
	
	public Gene() {
		
	}

	public Gene(int id, String entrez_gene_id, String summary) {
		this.id = id;
		this.entrez_gene_id = entrez_gene_id;
		this.summary = summary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntrez_gene_id() {
		return entrez_gene_id;
	}

	public void setEntrez_gene_id(String entrez_gene_id) {
		this.entrez_gene_id = entrez_gene_id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Gene [id=" + id + ", entrez_gene_id=" + entrez_gene_id
				+ ", summary=" + summary + "]";
	}
	
	
	

}