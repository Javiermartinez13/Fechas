
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Principal {

    public static void main(String[] args) {
        // Obtener la fecha y hora actual en la zona horaria local
        LocalDateTime fechaActualLocal = LocalDateTime.now();
        
        // Formatear la fecha y hora actual en formato de España
        DateTimeFormatter formatoEspana = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaEspana = fechaActualLocal.format(formatoEspana);
        System.out.println("Fecha actual en España: " + fechaEspana);

        // Obtener la fecha y hora actual en la zona horaria de Caracas
        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        LocalDateTime fechaCaracas = LocalDateTime.now(zonaCaracas);

        // Formatear la fecha y hora actual en formato de Caracas
        String fechaFormateadaCaracas = fechaCaracas.format(formatoEspana);
        System.out.println("Fecha actual en Caracas: " + fechaFormateadaCaracas);

        // Calcular los años transcurridos desde el descubrimiento de América (1492)
        int annosDesdeDescubrimiento = fechaActualLocal.getYear() - 1492;
        System.out.println("Años transcurridos desde el descubrimiento de América hasta la fecha actual: " + annosDesdeDescubrimiento + " años");

        // Calcular y mostrar la diferencia de horas entre Madrid y Caracas
        ZoneOffset offsetMadrid = ZoneId.of("Europe/Madrid").getRules().getOffset(Instant.now());
        ZoneOffset offsetCaracas = ZoneId.of("America/Caracas").getRules().getOffset(Instant.now());
        int diferenciaHoras = offsetMadrid.getTotalSeconds() - offsetCaracas.getTotalSeconds();
        System.out.println("Diferencia de horas entre Madrid y Caracas: " + diferenciaHoras / 3600 + " Horas");

        // Crear un LocalDateTime para la fecha y hora cuando Neil Armstrong pisó la luna
        LocalDateTime neilArmstrong = LocalDateTime.of(1969, 7, 21, 3, 56);
        System.out.println("Fecha y hora cuando Neil Armstrong pisó la Luna: " + neilArmstrong.format(formatoEspana));
    }
}



    

