package www.rodrigoledesmagarcia.com.mx.app.vista;

import org.springframework.data.jpa.repository.JpaRepository;
import www.rodrigoledesmagarcia.com.mx.app.modelo.Contacto;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {
}
