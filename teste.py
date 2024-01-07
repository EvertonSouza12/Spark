import os
from dotenv import load_dotenv
import pandas as pd
import json
import requests
import datetime
from datetime import timedelta

load_dotenv()

end = datetime.datetime.now()
start_date = start.strftime('%Y-%m-%d')
end_date = end.strftime('%Y-%m-%d')

url = ''
headers = {
        'Authorization': ,
        'Accept': 'application/json'
    }

try:
    response = requests.get(url, headers=headers)
    data = response.json()
    response.raise_for_status()
except requests.exceptions.HTTPError as err:
    raise SystemError(err)


try: 
    with open('', 'w') as f:
        json.dump(data, f)
        print("Json Gerado")

    with open('') as f:
        data = json.loads(f.read())

except FileExistsError:
    print("Arquivo não encontrado")
except json.JSONDecodeError:
    print("Erro na decodifição do arquivo")
except Exception as e:
    print(f"Ocorreu um ERRO não esparado {e}")

df = pd.json_normalize(data, record_path=["orders"])

newTab = df.drop(['' ], axis = 1, inplace = True)

df.drop([''],axis=1, inplace=True)

df[''] = pd.to_datetime(df[''])
df[''] = pd.to_datetime(df[''])

df = df.rename(columns={'': ''})
df = df.rename(columns={'': ''})
df = df.rename(columns={''})
df = df.rename(columns={''})
df = df.rename(columns={ '': ""})
df[''] = ' '

df['  '] = df['  '].dt.strftime('%Y-%m-%d')
df['  '] = df['  '].dt.strftime('%Y-%m-%d')


df.to_excel('', index=False)
print("  ")

try:
    tabela_origem = pd.read_excel('')
except FileNotFoundError:
    tabela_origem = pd.DataFrame()

try:
    tabela_destino = pd.read_excel('')
except FileNotFoundError:
    tabela_destino = pd.DataFrame()



tabela_destino = tabela_destino._append(tabela_origem, ignore_index=True)

tabela_destino.to_excel('', index=False)

remover_duplicado = pd.read_excel('')
remover_duplicado.drop_duplicates(subset=' ', inplace=True)
remover_duplicado.to_excel('', index=False)

print("------------------------------ Dados carregados com Sucesso ------------------------------")
