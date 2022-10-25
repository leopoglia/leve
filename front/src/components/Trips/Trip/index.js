
export default function Trip(props) {
    return (

        <div className='trip'>
            <img src={props.imagem} alt="" />

            <div className='nome-trip'>
                <span>{props.nome}</span>

                <div>
                    <span className="material-symbols-rounded">
                        star
                    </span>

                    <span className="material-symbols-rounded">
                        star
                    </span>

                    <span className="material-symbols-rounded">
                        star
                    </span>

                    <span className="material-symbols-rounded">
                        star
                    </span>

                    <span className="material-symbols-rounded">
                        star
                    </span>
                </div>
            </div>
        </div>
    );
}
