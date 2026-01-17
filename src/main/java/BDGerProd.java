//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDGerProd{

    private static BDGerProd gerProcUnic;
    private static BDGerProd gerPlacaVUnic;
    private static BDGerProd gerPlacaMUnic;
    private Processador proc;
    private PlacaDeVideo placaV;
    private PlacaMae placaM;
    private final List<PlacaMae> bdPlacaM;
    private final List<PlacaDeVideo> bdPlacaV;
    private final List<Processador> bdProc;
    
    
    private BDGerProd(){
        proc = new Processador();
        placaV = new PlacaDeVideo();
        placaM = new PlacaMae();
        bdProc = new ArrayList<>();
        bdPlacaV = new ArrayList<>();
        bdPlacaM = new ArrayList<>();
    }
    
    //MÉTODO SINGLETON
    public static BDGerProd gerGerProc(){
        if(gerProcUnic == null){
            gerProcUnic = new BDGerProd();
        }
        return gerProcUnic;
    }
    
    //MÉTODO SINGLETON
    public static BDGerProd gerGerPlacaV(){
        if(gerPlacaVUnic == null){
            gerPlacaVUnic = new BDGerProd();
        }
        return gerPlacaVUnic;
    }
    
    //MÉTODO SINGLETON
    public static BDGerProd gerGerPlacaM(){
        if(gerPlacaMUnic == null){
            gerPlacaMUnic = new BDGerProd();
        }
        return gerPlacaMUnic;
    }
    
    public List<Processador> getBdProc(){
        return bdProc;
    }

	public Processador cadProc(Processador proc){
            
            if(consProc(proc)== null){
                bdProc.add(proc);
                return proc;
            }
            else {
                        return null;
            }
	}

        public Processador removeProcPorMarcaModelo(Processador proc) {
            for (int i = 0; i < bdProc.size(); i++) {
                Processador procDaLista = bdProc.get(i);

                if (procDaLista.getMarca().equalsIgnoreCase(proc.getMarca()) &&
                procDaLista.getModelo().equalsIgnoreCase(proc.getModelo())) {

                return bdProc.remove(i); 
            }
        }

        return null;
    }

    public Processador alteraProc(Processador procDeBusca) {
        
        for (Processador proc : bdProc) {

            if (proc.getMarca().trim().equalsIgnoreCase(procDeBusca.getMarca().trim()) &&
                proc.getModelo().trim().equalsIgnoreCase(procDeBusca.getModelo().trim())) {

                try {
                    String novoPreco = JOptionPane.showInputDialog(
                        null, 
                        "Processador: " + proc.getModelo() + "\nPreço atual: " + proc.getPreco() + "\n\nInforme o NOVO preço:", 
                        "Alterar Preço", 
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (novoPreco == null) {
                        JOptionPane.showMessageDialog(null, "Alteração de preço cancelada.",
                                "Cancelado",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                        return null; 
                    }

                    String novaGarantia = JOptionPane.showInputDialog(
                        null,
                        "Processador: " + proc.getModelo() + "\nGarantia atual: " + proc.getDataGarantia() + "\n\nInforme a NOVA garantia:",
                        "Alterar Garantia",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (novaGarantia == null) {
                        JOptionPane.showMessageDialog(null, "Alteração de garantia cancelada.",
                                "Cancelado",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                        return null; 
                    }


                    proc.setPreco(Float.parseFloat(novoPreco));
                    proc.setDataGarantia(novaGarantia);

                    return proc;

                } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Preço inválido. Por favor, digite um número.",
                                "Erro de Formato",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return null;
                } catch (PrecoInvException pie) {
                        JOptionPane.showMessageDialog(
                                null,
                                pie.getMessage(),
                                "ERRO",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return null;
                    }
                 }   
        }
        return null;
    }

    
        public Processador consProc(Processador consProc) {
        for (int i = 0; i < bdProc.size(); i++) {
            
            if (consProc.getMarca().equalsIgnoreCase(bdProc.get(i).getMarca()) &&
                consProc.getModelo().equalsIgnoreCase(bdProc.get(i).getModelo())) {
                return bdProc.get(i);
            }
        }
        return null;
    }
        
    public List<PlacaDeVideo> getBdPlacaV(){
        return bdPlacaV;
    }

	public PlacaDeVideo cadPlacaV(PlacaDeVideo placaV){
            
            if(consPlacaV(placaV)== null){
                bdPlacaV.add(placaV);
                return placaV;
            }
            else {
                return null;
            }
	}

        public PlacaDeVideo removePlacaVPorMarcaModelo(PlacaDeVideo placaV) {

            for (int i = 0; i < bdPlacaV.size(); i++) {
                PlacaDeVideo placaVideoDaLista = bdPlacaV.get(i);

                if (placaVideoDaLista.getModelo().equalsIgnoreCase(placaV.getModelo()) &&
                        placaVideoDaLista.getMarca().equalsIgnoreCase(placaV.getMarca())) {

                return bdPlacaV.remove(i); 
            }
        }

        return null;
    }

   public PlacaDeVideo alteraPlacaV(PlacaDeVideo placaVDeBusca) {
       
    for (PlacaDeVideo placaV : bdPlacaV) {
        

        if (placaV.getMarca().trim().equalsIgnoreCase(placaVDeBusca.getMarca().trim()) &&
            placaV.getModelo().trim().equalsIgnoreCase(placaVDeBusca.getModelo().trim())) {

            try {
                String novoPrecoStr = JOptionPane.showInputDialog(
                    null, 
                    "Placa De Video: " + placaV.getModelo() +
                            "\nPreço atual: "   
                            + placaV.getPreco() +
                            "\n\nInforme o NOVO preço:", 
                    "Alterar Preço", 
                    JOptionPane.QUESTION_MESSAGE
                );
                
                if (novoPrecoStr == null) {
                    JOptionPane.showMessageDialog(
                            null, "Alteração de preço cancelada.",
                            "Cancelado",    
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    return null; 
                }
                

                String novaGarantia = JOptionPane.showInputDialog(
                    null,
                    "Placa De Video: " + placaV.getModelo() +
                            "\nGarantia atual: "
                            + placaV.getDataGarantia() +
                            "\n\nInforme a NOVA garantia:",
                    "Alterar Garantia",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                if (novaGarantia == null) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Alteração de garantia cancelada.",
                            "Cancelado",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    return null; 
                }
                

                placaV.setPreco(Float.parseFloat(novoPrecoStr));
                placaV.setDataGarantia(novaGarantia);
                return placaV;
                
            }
            
            catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Preço inválido. Por favor, digite um número.",
                            "Erro de Formato",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return null;
            }
            
            catch (PrecoInvException pie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pie.getMessage(),
                            "ERRO",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
             }
        }
        return null;
    }

    
        public PlacaDeVideo consPlacaV(PlacaDeVideo consPlacaV) {
        for (int i = 0; i < bdPlacaV.size(); i++) {
            
            if (consPlacaV.getMarca().equalsIgnoreCase(bdPlacaV.get(i).getMarca()) &&
                consPlacaV.getModelo().equalsIgnoreCase(bdPlacaV.get(i).getModelo())) {
                return bdPlacaV.get(i);
            }
        }
        return null;
    }    
        
    public List<PlacaMae> getBdPlacaM(){
        return bdPlacaM;
    }

	public PlacaMae cadPlacaM(PlacaMae placaM){
            
            if(consPlacaM(placaM)== null){
                bdPlacaM.add(placaM);
                return placaM;
            }
            else {
                return null;
            }
	}

        public PlacaMae removePlacaMPorMarcaModelo(PlacaMae placaMParaRemover) {

            for (int i = 0; i < bdPlacaM.size(); i++) {
                PlacaMae placaMDaLista = bdPlacaM.get(i);


                if (placaMDaLista.getMarca().equalsIgnoreCase(placaMParaRemover.getMarca()) &&
                placaMDaLista.getModelo().equalsIgnoreCase(placaMParaRemover.getModelo())) {


                return bdPlacaM.remove(i); 
            }
        }

        return null;
    }


    public PlacaMae alteraPlacaM(PlacaMae placaMDeBusca) {
        
        for (PlacaMae placaM : bdPlacaM) {
        
        if (placaM.getMarca().trim().equalsIgnoreCase(placaMDeBusca.getMarca().trim()) &&
            placaM.getModelo().trim().equalsIgnoreCase(placaMDeBusca.getModelo().trim())) {

            
            try {
                String novoPrecoStr = JOptionPane.showInputDialog(
                    null, 
                    "Placa Mãe: " + placaM.getModelo() + "\nPreço atual: "
                            + placaM.getPreco() + 
                            "\n\nInforme o NOVO preço:", 
                    "Alterar Preço",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                if (novoPrecoStr == null) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Alteração de preço cancelada.",
                            "Cancelado",
                            JOptionPane.INFORMATION_MESSAGE);
                    return null; 
                }
                
                String novaGarantia = JOptionPane.showInputDialog(
                    null,
                    "Placa Mãe: " + placaM.getModelo() + "\nGarantia atual: "
                            + placaM.getDataGarantia() + 
                            "\n\nInforme a NOVA garantia:",
                    "Alterar Garantia",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                if (novaGarantia == null) {
                    JOptionPane.showMessageDialog(
                            null, 
                            "Alteração de garantia cancelada.",
                            "Cancelado",
                            JOptionPane.INFORMATION_MESSAGE);
                    return null; 
                }
                
                placaM.setPreco(Float.parseFloat(novoPrecoStr));
                placaM.setDataGarantia(novaGarantia);
                
                return placaM;
                
            } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Preço inválido. Por favor, digite um número.",
                            "Erro de Formato",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return null;
            } catch (PrecoInvException pie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pie.getMessage(),
                            "ERRO",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
             }
     }
        return null;
    }

    
        public PlacaMae consPlacaM(PlacaMae consPlacaM) {
        for (int i = 0; i < bdProc.size(); i++) {

            if (consPlacaM.getMarca().equalsIgnoreCase(bdPlacaM.get(i).getMarca()) &&
                consPlacaM.getModelo().equalsIgnoreCase(bdPlacaM.get(i).getModelo())) {
                return bdPlacaM.get(i);
            }
        }
        return null;
    }    
        
}//fim da classe