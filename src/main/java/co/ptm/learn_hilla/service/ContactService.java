package co.ptm.learn_hilla.service;

import co.ptm.learn_hilla.data.Contact;
import co.ptm.learn_hilla.data.ContactRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.ListRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class ContactService extends ListRepositoryService<Contact, Long, ContactRepository> {

    public Contact save(Contact contact) {
        return getRepository().save(contact);
    }

}
