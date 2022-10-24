import Header from "../App/Header";
import Footer from "../App/Footer";
import Main from "../App/Main";
import "./Trip.css"

export default function Trip() {
    return (
        <div className="Trip">

            <Header />

            <main>

                <div className="name">
                    <h1>Coliseu de Roma</h1>

                    <span>
                        Coliseu, também conhecido como Anfiteatro Flaviano, é um anfiteatro oval localizado no centro da cidade de Roma, capital da Itália. Construído com tijolos revestidos de argamassa e areia, e originalmente cobertos com travertino é o maior anfiteatro já construído e está situado a leste do Fórum Romano.
                    </span>

                    <div className="infos">
                        <div>
                            <div className="de-para">
                                <span className="material-symbols-outlined">
                                    trip_origin
                                </span>

                                <span>&nbsp; Jaraguá do Sul</span>
                                <span className="material-symbols-outlined">
                                    chevron_right
                                </span>
                                <span>Roma</span>
                            </div>

                            <div className="date">
                                <span className="material-symbols-outlined">
                                    calendar_month
                                </span>

                                <span>&nbsp; 24/10/2022</span>
                                <span className="material-symbols-outlined">
                                    chevron_right
                                </span>
                                <span>&nbsp; 28/10/2022</span>
                            </div>
                        </div>

                        <div className="price-buy">
                            <div className="price">R$ 2.500,00</div>
                            <button>COMPRAR</button>
                        </div>
                    </div>
                </div>

                <img src="https://midias.correiobraziliense.com.br/_midias/jpg/2022/06/20/675x450/1__124279680_gettyimages_599134940-25899615.jpg?20220620141331?20220620141331" />



            </main>

            <Main />


            <Footer />

        </ div>
    );
}