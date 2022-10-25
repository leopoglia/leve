import "./style.css"
import Trip from "../Trip";

export default function Main() {
    return (
        <div className="main-trips">
            <div className="title">
                <h1>Próximas Viagens</h1>
                <span>Veja as próximas viagens que estão saindo</span>
            </div>

            <div className='trips-list'>
                <Trip />
                <Trip />
                <Trip />
                <Trip />
                <Trip />
                <Trip />
                <Trip />
                <Trip />
                <Trip />

            </div>
        </div>
    );

}