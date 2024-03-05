package br.com.pucminas.barbeariateste.configurations;

import br.com.pucminas.barbeariateste.entities.*;
import br.com.pucminas.barbeariateste.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("test")
@AllArgsConstructor
public class TestConfigs implements CommandLineRunner {
    private ClienteRepository clienteRepository;
    private AgendamentoRepository agendamentoRepository;
    private BarbeiroRepository barbeiroRepository;
    private FeedbackRepository feedbackRepository;
    private ServicoRepository servicoRepository;
    private HorarioRepository horarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Horario hor = new Horario(1L);
        horarioRepository.save(hor);
        Barbeiro barbeiro = new Barbeiro("Carlos", "12345", "abc@d.com", 1L, 5, hor);
        barbeiroRepository.save(barbeiro);
        Servico servico = new Servico("Corte", 5, 50.0, 40, barbeiro, 1L);
        servicoRepository.save(servico);
        Agendamento agendamento = new Agendamento(LocalDateTime.now(), servico, 1L);
        agendamentoRepository.save(agendamento);
        List<Agendamento> agendamentos = new ArrayList<>();
        agendamentos.add(agendamento);
        Cliente cliente = new Cliente("Pedro", "12345", "pedrohpaiva1258@gmail.com", 1L, agendamentos);
        clienteRepository.save(cliente);
    }
}
