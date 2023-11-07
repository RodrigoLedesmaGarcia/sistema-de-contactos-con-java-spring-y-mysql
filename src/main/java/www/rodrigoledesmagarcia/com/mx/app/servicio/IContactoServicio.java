package www.rodrigoledesmagarcia.com.mx.app.servicio;

import www.rodrigoledesmagarcia.com.mx.app.modelo.Contacto;

import java.util.List;

public interface IContactoServicio {

    public List<Contacto> listarContactos();

    public Contacto buscarContactoPorId(Integer idContacto);

    public void guardarContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);

}
