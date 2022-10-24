import "./Admin.css";
import Header from "../App/Header";


export default function Admin() {
    return (
        <div className="Admin">
            <Header />

            <main></main>


            <div className="actions">

                <div className="action">
                    <div>
                        <span class="material-symbols-outlined">
                            hotel
                        </span>
                        Viagem
                    </div>
                </div>
                <div className="action">
                    <div>
                        <span class="material-symbols-outlined">
                            transportation
                        </span>
                        Transporte
                    </div>
                </div>
                <div className="action">
                    <div>
                        <span class="material-symbols-outlined">
                            location_on
                        </span>
                        Localização
                    </div>
                </div>
            </div>
        </div>
    );
}