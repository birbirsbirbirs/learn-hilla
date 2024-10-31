import {AutoGrid} from "@vaadin/hilla-react-crud";
import {ContactService} from "Frontend/generated/endpoints";
import ContactModel from "Frontend/generated/co/ptm/learn_hilla/data/ContactModel";

export default function App() {
  return (
      <div className={"p-m"}>
          <AutoGrid service={ContactService} model={ContactModel} />
      </div>
  )
}
