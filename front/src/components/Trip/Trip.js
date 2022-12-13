import Header from "../App/Header";
import Footer from "../App/Footer";
import Main from "../App/Main";
import "./Trip.css"

import { useState, useEffect } from "react";
import Services from "../../service/service.ts";

export default function Trip() {
    const [trip, setTrip] = useState();

    const url = window.location.pathname;
    const newstr = url.replace("/trip/", "");


    useEffect(() => {
        Services.buscarViagem(newstr).then((response) => {
            setTrip(response);
            console.log(trip)
            console.log(response);
        });
    }, [trip, newstr]);

    return (
        <div className="Trip">

            <Header />

            <main>

                <div className="name">
                    <h1>{trip?.localDesembarque.localizacao}</h1>

                    <span className="desc">
                        {trip?.localDesembarque.descricao}
                    </span>

                    <div className="infos">
                        <div className="de-date">
                            <div className="de-para">
                                <span className="material-symbols-outlined">
                                    trip_origin
                                </span>

                                <span>&nbsp; {trip?.localEmbarque.localizacao}</span>
                                <span className="material-symbols-outlined">
                                    chevron_right
                                </span>
                                <span>{trip?.localDesembarque.localizacao}</span>
                            </div>

                            <div className="date">
                                <span className="material-symbols-outlined">
                                    calendar_month
                                </span>

                                <span>&nbsp; {trip?.dataSaida}</span>
                                <span className="material-symbols-outlined">
                                    chevron_right
                                </span>
                                <span>&nbsp; {trip?.dataChegada}</span>
                            </div>
                        </div>

                        <div className="price-buy">
                            <div className="price">R${trip?.valor}</div>
                            <button>COMPRAR</button>
                        </div>
                    </div>
                </div>

                <img alt="" src={trip?.localDesembarque.imagem} />



            </main>

            <Main />


            <Footer />

        </ div>
    );
}