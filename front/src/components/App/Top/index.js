import './style.css';
import { useState } from 'react';
export default function Header() {

    const [vehicle, setVehicle] = useState(<img className='air-plane' src="https://www.pngkey.com/png/full/373-3731596_com-a-ajuda-de-seu-mentor-skipper-o.png" alt="" />);

    return (
        <div className="top-app">

            {vehicle}

            <div className="box-background">
                <dl>
                    <dd onClick={() => {
                        setVehicle(<img className='air-plane' src="https://www.pngkey.com/png/full/373-3731596_com-a-ajuda-de-seu-mentor-skipper-o.png" alt="" />)
                    }}>
                        <span className="material-symbols-outlined">
                            flight_takeoff
                        </span>
                        Avião
                    </dd>
                    <dd onClick={() => {
                        setVehicle(<img className='train' src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/d3789c8c-0874-407c-a457-03b147f59b18/demyu0b-73a989a0-45fc-43f2-8ca2-175aa4cf4cf5.png/v1/fill/w_570,h_601,strp/thomas_the_tank_engine_by_darkmoonanimation_demyu0b-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NjAxIiwicGF0aCI6IlwvZlwvZDM3ODljOGMtMDg3NC00MDdjLWE0NTctMDNiMTQ3ZjU5YjE4XC9kZW15dTBiLTczYTk4OWEwLTQ1ZmMtNDNmMi04Y2EyLTE3NWFhNGNmNGNmNS5wbmciLCJ3aWR0aCI6Ijw9NTcwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.WM2bAYvDbuXhSEiHjOWOy45lEbbvu_Fv_Xunm8ka0mw" alt="" />)
                    }}>
                        <span className="material-symbols-outlined">
                            train
                        </span>
                        Trem
                    </dd>

                    <dd onClick={() => {
                        setVehicle(<img className='bus' src="https://i.imgur.com/nWvvaPo_d.webp?maxwidth=760&fidelity=grand" alt="" />)
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