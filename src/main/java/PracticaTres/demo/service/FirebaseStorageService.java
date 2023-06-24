
package PracticaTres.demo.service;

import org.springframework.web.multipart.MultipartFile;


public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

  
    final String BucketName = "techshop-a7a02.appspot.com";

    
    final String rutaSuperiorStorage = "arboles";

    
    final String rutaJsonFile = "firebase";
    
    
    final String archivoJsonFile = "arboles-f9053-firebase-adminsdk-a57so-7ce95b61a6.js";

}
