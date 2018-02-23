package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import entity.Recarga;

public class RecargaDao {

	public void gravarDados(Recarga r) {

		try {
			
			FileWriter fw = new FileWriter("E:\\rodrigo.perfil\\Workspace\\recargaja-teste1\\recargaja-1\\src\\txt\\log.txt", true);
			fw.write(""+r);
			fw.write("\r\n"); 
			fw.close();
		
			System.out.println("Dados gravados com sucesso.");
		}

		catch (Exception e) {
			System.out.println("Erro ao gravar arquivo: " + e.getMessage());

		}
	}
	
	public List<String> listar()throws Exception{
		
		File file = new File("E:\\rodrigo.perfil\\Workspace\\recargaja-teste1\\recargaja-1\\src\\txt\\log.txt");
		
		List<String>listaString = new ArrayList<String>();

		try {
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linha;
			
			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println(linha);
				listaString.add(linha);

			}
			
			bufferedReader.close();
			
		} 
		catch (Exception e) {
			System.out.println("Erro ao listar arquivo"+ e.getMessage());
		}
			
		return listaString;
	
	}
	
}





