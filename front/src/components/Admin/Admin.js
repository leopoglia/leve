import "./Admin.css";
import Header from "../App/Header";
import Services from "../../service/service.ts";
import { useState } from "react";


export default function Admin() {
    const [input, setInput] = useState();

    const [embarque, setEmbarque] = useState("");
    const [desembarque, setDesembarque] = useState("");
    const [saida, setSaida] = useState("");
    const [chegada, setChegada] = useState("");
    const [valor, setValor] = useState("");

    function cadastrarViagem() {
        const viagem = {
            embarque: embarque,
            desembarque: desembarque,
            saida: saida,
            chegada: chegada,
            valor: valor,
        }

        Services.cadastrarViagem(viagem);
    }

    const [assento, setAssento] = useState("");
    function cadastrarTransporte() {
        const transporte = {
            assento: assento
        }

        Services.cadastrarTransporte(transporte);
    }

    return (
        <div className="Admin">
            <Header />

            <main />

            <div className="actions">

                <div className="action" onClick={() => {
                    setInput('viagem')
                }}>
                    <div>
                        <span className="material-symbols-outlined">
                            hotel
                        </span>
                        Viagem
                    </div>
                </div>
                <div className="action" onClick={() => {
                    setInput('transporte')
                }}>
                    <div>
                        <span className="material-symbols-outlined">
                            transportation
                        </span>
                        Transporte
                    </div>
                </div>
                <div className="action" onClick={() => {
                    setInput('localização')
                }}>
                    <div>
                        <span className="material-symbols-outlined">
                            location_on
                        </span>
                        Localização
                    </div>
                </div>
            </div>

            {input === 'viagem' &&
                <div className="form">
                    <label >Local Embarque</label>
                    <input type="text"
                        value={embarque}
                        onChange={(e) => setEmbarque(e.target.value)}
                    />

                    <label>Local Dembarque</label>
                    <input type="text"
                        value={desembarque}
                        onChange={(e) => setDesembarque(e.target.value)}
                    />

                    <label>Data Saída</label>
                    <input type="date"
                        value={saida}
                        onChange={(e) => setSaida(e.target.value)}
                    />

                    <label>Data Cheagada</label>
                    <input type="date"
                        value={chegada}
                        onChange={(e) => setChegada(e.target.value)}
                    />

                    <label>Preço</label>
                    <input type="text"
                        value={valor}
                        onChange={(e) => setValor(e.target.value)}
                    />

                    <button onClick={() => { cadastrarViagem() }}>Cadastrar</button>
                </div>
            }

            {input === 'transporte' &&
                <div className="form">
                    <label>Números de assentos</label>
                    <input type="text"
                        value={assento}
                        onChange={(e) => setAssento(e.target.value)}
                    />


                    <button onClick={() => { cadastrarTransporte() }}>Cadastrar</button>
                </div>}

            {input === 'localização' &&
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
            }
        </div>
    );
}