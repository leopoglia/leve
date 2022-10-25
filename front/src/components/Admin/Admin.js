import "./Admin.css";
import Header from "../App/Header";
import Services from "../../service/service.ts";
import { useState } from "react";


export default function Admin() {
    const [input, setInput] = useState();

    const [embarque, setEmbarque] = useState("aaa");

    function cadastrarViagem() {
        console.log("aaaaaaaa")
        console.log(embarque)
        Services.cadastrarViagem(input);

    }

    return (
        <div className="Admin">
            <Header />

            <main />


            <div className="actions">

                <div className="action" onClick={() => {
                    setInput(<div className="form">
                        <label >Local Embarque</label>
                        <input type="text"
                            onChange={event => {
                                setEmbarque(event.target.value);
                            }}
                        />
                        {embarque}

                        <label>Local Dembarque</label>
                        <input type="text" />

                        <label>Data Saída</label>
                        <input type="text" onChange={event => {
                            this.setState({
                                dataSaida: event.target.value
                            });
                        }} />

                        <label>Data Cheagada</label>
                        <input type="text" onChange={event => {
                            this.setState({
                                dataChegada: event.target.value
                            });
                        }} />

                        <label>Preço</label>
                        <input type="text" onChange={event => {
                            this.setState({
                                preco: event.target.value
                            });
                        }} />

                        <button onClick={() => { cadastrarViagem() }}>Cadastrar</button>
                    </div>)
                }}>
                    <div>
                        <span className="material-symbols-outlined">
                            hotel
                        </span>
                        Viagem
                    </div>
                </div>
                <div className="action" onClick={() => {
                    setInput(
                        <div className="form">
                            <label>Números de assentos</label>
                            <input type="text" />

                            <button>Cadastrar</button>
                        </div>)
                }}>
                    <div>
                        <span className="material-symbols-outlined">
                            transportation
                        </span>
                        Transporte
                    </div>
                </div>
                <div className="action" onClick={() => {
                    setInput(
                        <div className="form">
                            <label>Nome localização</label>
                            <input type="text" />

                            <label>Descrição</label>
                            <input type="text" />

                            <div className="flex">
                                <label>Imagem</label>
                                <input id="img-loc" type="file" />
                                <label id="img" for="img-loc">Escolher imagem</label>
                            </div>


                            <button>Cadastrar</button>
                        </div>
                    )
                }}>
                    <div>
                        <span className="material-symbols-outlined">
                            location_on
                        </span>
                        Localização
                    </div>
                </div>
            </div>

            {input}


        </div>
    );
}