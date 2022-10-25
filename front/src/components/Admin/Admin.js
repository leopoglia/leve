import "./Admin.css";
import Header from "../App/Header";
import { useState } from "react";


export default function Admin() {
    const [input, setInput] = useState(<form>
        <label>Local Embarque</label>
        <input type="text" />

        <label>Local Dembarque</label>
        <input type="text" />

        <label>Data Saída</label>
        <input type="text" />

        <label>Data Cheagada</label>
        <input type="text" />

        <label>Preço</label>
        <input type="text" />

        <button>Cadastrar</button>
    </form>);




    return (
        <div className="Admin">
            <Header />

            <main></main>


            <div className="actions">

                <div className="action" onClick={() => {
                    setInput(<form>
                        <label>Local Embarque</label>
                        <input type="text" />

                        <label>Local Dembarque</label>
                        <input type="text" />

                        <label>Data Saída</label>
                        <input type="text" />

                        <label>Data Cheagada</label>
                        <input type="text" />

                        <label>Preço</label>
                        <input type="text" />

                        <button>Cadastrar</button>
                    </form>)
                }}>
                    <div>
                        <span class="material-symbols-outlined">
                            hotel
                        </span>
                        Viagem
                    </div>
                </div>
                <div className="action" onClick={() => {
                    setInput(
                        <form>
                            <label>Números de assentos</label>
                            <input type="text" />

                            <button>Cadastrar</button>
                        </form>)
                }}>
                    <div>
                        <span class="material-symbols-outlined">
                            transportation
                        </span>
                        Transporte
                    </div>
                </div>
                <div className="action" onClick={() => {
                    setInput(
                        <form>
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
                        </form>
                    )
                }}>
                    <div>
                        <span class="material-symbols-outlined">
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