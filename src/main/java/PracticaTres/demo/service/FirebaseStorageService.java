
package PracticaTres.demo.service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartFile;


public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

  
    final String BucketName = "practicaarbol.appspot.com";

    
    final String rutaSuperiorStorage = "arboles";

    
    final String rutaJsonFile = "firebase";
    
    
    final String archivoJsonFile = "practicaarbol-firebase-adminsdk-09gn7-e64664c023.json";

}
