import "./style.css"
import Trip from "../Trip";
import { useState, useEffect } from "react";
import Services from "../../../service/service.ts";

export default function Main() {

    const [lista, setLista] = useState([]);

    useEffect(() => {
        Services.buscarViagens().then((response) => {
            setLista(response);
            console.log(response);
            console.log(response[0].codigoViagem);
        });
    }, []);



    return (
        <div className="main-trips">
            <div className="title">
                <h1>Próximas Viagens</h1>
                <span>Veja as próximas viagens que estão saindo</span>
            </div>

            <div className='trips-list'>
                {lista.map((item) => {
                    return (
                        <Trip link={item.codigoViagem} nome={item.localDesembarque.localizacao} imagem={item.localDesembarque.imagem} />
                    )
                }
                )}

            </div>
        </div>
    );

}