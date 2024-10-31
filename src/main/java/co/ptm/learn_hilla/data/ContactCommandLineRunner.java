package co.ptm.learn_hilla.data;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class ContactCommandLineRunner implements CommandLineRunner {
    private final ContactRepository contactRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Contact> contactList = List.of(
                Contact.builder()
                        .firstName("Isabella")
                        .lastName("Rodriguez")
                        .email("isabella.rodriguez@gmail.com")
                        .phone("(312) 555-8976")
                        .build(),

                Contact.builder()
                        .firstName("Alexander")
                        .lastName("Chen")
                        .email("alex.chen@outlook.com")
                        .phone("(415) 555-3421")
                        .build(),

                Contact.builder()
                        .firstName("Sophia")
                        .lastName("Patel")
                        .email("sophia.patel@yahoo.com")
                        .phone("(647) 555-9082")
                        .build(),

                Contact.builder()
                        .firstName("Marcus")
                        .lastName("O'Connor")
                        .email("marcus.oconnor@hotmail.com")
                        .phone("(202) 555-4567")
                        .build(),

                Contact.builder()
                        .firstName("Olivia")
                        .lastName("Schmidt")
                        .email("olivia.schmidt@gmail.com")
                        .phone("(778) 555-2345")
                        .build(),

                Contact.builder()
                        .firstName("Ethan")
                        .lastName("Kim")
                        .email("ethan.kim@gmail.com")
                        .phone("(213) 555-7890")
                        .build(),

                Contact.builder()
                        .firstName("Aisha")
                        .lastName("Mohammed")
                        .email("aisha.m@outlook.com")
                        .phone("(416) 555-6543")
                        .build(),

                Contact.builder()
                        .firstName("Lucas")
                        .lastName("Silva")
                        .email("lucas.silva@yahoo.com")
                        .phone("(305) 555-1234")
                        .build(),

                Contact.builder()
                        .firstName("Emma")
                        .lastName("Thompson")
                        .email("emma.t@hotmail.com")
                        .phone("(604) 555-8765")
                        .build(),

                Contact.builder()
                        .firstName("James")
                        .lastName("Wilson")
                        .email("james.wilson@gmail.com")
                        .phone("(617) 555-4321")
                        .build()
        );

        contactRepository.saveAll(contactList);
    }
}
