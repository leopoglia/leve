import './style.css';
import { useState } from 'react';
export default function Header() {

    const [vehicle, setVehicle] = useState(false);

    console.log(vehicle);

    return (
        <div className="top-app">

            <img className='aviao' src="https://www.pngkey.com/png/full/373-3731596_com-a-ajuda-de-seu-mentor-skipper-o.png" alt="" />

            <div className="box-background">
                <dl>
                    <dd onClick={() => {
                        setVehicle("air")
                    }}>
                        <span className="material-symbols-outlined">
                            flight_takeoff
                        </span>
                        Avião
                    </dd>
                    <dd onClick={() => {
                        setVehicle("train")
                    }}>
                        <span className="material-symbols-outlined">
                            train
                        </span>
                        Trem
                    </dd>

                    <dd onClick={() => {
                        setVehicle("bus")
                    }}>
                        <span className="material-symbols-outlined">
                            airport_shuttle
                        </span>
                        Ônibus
                    </dd>
                </dl>

                <div className='box'>


                    <div className='busca'>
                        <div className='de'>
                            <div className='label'>
                                <label>De</label>
                                <span className="material-symbols-outlined">
                                    north_east
                                </span>
                            </div>
                            <input type="text" placeholder='De' />
                        </div>

                        <div className='sync'>
                            <span className="material-symbols-outlined">
                                sync_alt
                            </span>
                        </div>

                        <div className='para'>
                            <div className='label'>
                                <label>Para</label>

                                <span className="material-symbols-outlined">
                                    south_east
                                </span>
                            </div>
                            <input type="text" placeholder='Para' />
                        </div>
                    </div>

                    <div className='infos'>
                        <div className='data'>

                            <div className='ida'>
                                <label>Ida</label>
                                <input type="date" />
                            </div>

                            <div className='data-sync'>
                                <span className="material-symbols-outlined">
                                    follow_the_signs
                                </span>
                            </div>

                            <div className='volta'>
                                <label>Volta</label>
                                <input type="date" />
                            </div>

                        </div>
                    </div>


                    <div className='footer-box'>
                        <div className='pass'>
                            <div className='label'>
                                <label>Passageiros</label>
                            </div>

                            <div className='number'>

                                <div className='most'><span>-</span></div>

                                <input type="number" placeholder='0' />

                                <div className='less'><span>+</span></div>

                            </div>

                        </div>

                        <input className='get' type="button" value='Buscar' />
                    </div>



                </div>
            </div>
        </div>
    );
}  