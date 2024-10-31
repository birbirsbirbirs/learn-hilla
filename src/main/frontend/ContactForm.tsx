import Contact from "Frontend/generated/co/ptm/learn_hilla/data/Contact";
import {useForm} from "@vaadin/hilla-react-form";
import ContactModel from "Frontend/generated/co/ptm/learn_hilla/data/ContactModel";
import {Button, TextField} from "@vaadin/react-components";
import React, {useEffect} from "react";

interface ContactFormProps {
    contact: Contact;
    onSubmit: (contact: Contact) => Promise<void>;
}

export default function ContactForm({contact, onSubmit}: ContactFormProps) {
    const {field, model, submit, read, invalid} = useForm(ContactModel, {
        onSubmit: onSubmit
    })

    useEffect(() => {
        read(contact);
    }, [contact])

    return (
        <div className={"grid grid-cols-2 gap-s"}>
            <TextField label={"First Name"} {...field(model.firstName)}></TextField>
            <TextField label={"Last Name"} {...field(model.lastName)}></TextField>
            <TextField label={"Email"} {...field(model.email)}></TextField>
            <TextField label={"Phone"} {...field(model.phone)}></TextField>
            <Button onClick={submit} theme={"primary"} disabled={invalid}>Save</Button>
        </div>
    );
}