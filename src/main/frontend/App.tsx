import {AutoGrid, AutoGridRef} from "@vaadin/hilla-react-crud";
import {ContactService} from "Frontend/generated/endpoints";
import ContactModel from "Frontend/generated/co/ptm/learn_hilla/data/ContactModel";
import React, {useEffect, useState} from "react";
import Contact from "Frontend/generated/co/ptm/learn_hilla/data/Contact";
import ContactForm from "Frontend/ContactForm";

export default function App() {

    const [selected, setSelected] = useState<Contact | null>();
    const [names, setNames] = useState<string[]>([]);
    const autoGridRef = React.useRef<AutoGridRef>(null);

    function refreshGrid() {
        autoGridRef.current?.refresh();
    }

    async function onSubmit(contact: Contact) {
        const saved = await ContactService.save(contact);
        setSelected(saved);
        refreshGrid();
    }

    useEffect(() => {
        // @ts-ignore
        ContactService.getNames().onNext(name => setNames(prevState => [...prevState, name]))
    }, []);

    return (
        <div className={"p-m"}>
            <AutoGrid
                service={ContactService}
                model={ContactModel}
                onActiveItemChanged={e => setSelected(e.detail.value)}
                selectedItems={[selected]}
                ref={autoGridRef}
            />
            <ul>
                {names.map((name, index) => (
                    <li key={index}>{name}</li>
                ))}
            </ul>
            {selected && <ContactForm contact={selected} onSubmit={onSubmit}/>}

        </div>
    )
}
