import Header from "../App/Header";
import "./Trip.css"

export default function Trip() {
    return (
        <div className="Trip">

            <Header />

            <main>

                <div className="name">
                    <h1>Coliseu de Roma</h1>

                    <span>
                        Coliseu, também conhecido como Anfiteatro Flaviano, é um anfiteatro oval localizado no centro da cidade de Roma
                    </span>
                </div>

                <img src="https://midias.correiobraziliense.com.br/_midias/jpg/2022/06/20/675x450/1__124279680_gettyimages_599134940-25899615.jpg?20220620141331?20220620141331" />



            </main>

        </ div>
    );
}