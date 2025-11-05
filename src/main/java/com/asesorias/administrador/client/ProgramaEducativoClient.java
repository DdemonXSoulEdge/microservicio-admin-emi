package com.asesorias.administrador.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.asesorias.administrador.dto.ProgramaEducativoDTO;
// import com.asesorias.administrador.config.FeignConfig;

@FeignClient(name = "ProgramaEducativo") // Después se agrega | configuration = FeignConfig.class | Para propagar el token
public interface ProgramaEducativoClient {
    @PostMapping("/api/programas/by-ids") // Se debe agregar el endpoint by-ids en el microservicio del  programa educativo
    List<ProgramaEducativoDTO> getProgramaEducativoByIds(@RequestBody List<Integer> ids); // Asi se debe de llamar la función del endpoint
}
